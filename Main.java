import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Chathurasri", "CSE AIML"));
        students.add(new Student(102, "Rahul", "CSE"));

        int choice;

        do {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Display Students");
            System.out.println("2. Search Student");
            System.out.println("3. Add Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (Student s : students) {
                    s.display();
                }
            }

            else if (choice == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                students.add(new Student(id, name, course));
                System.out.println("Student Added!");
            }

            else if (choice == 2 || choice == 4 || choice == 5) {
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                Student found = null;

                for (Student s : students) {
                    if (s.id == id) {
                        found = s;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("Student Not Found!");
                }
                else if (choice == 2) {
                    found.display();
                }
                else if (choice == 4) {
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String name = sc.nextLine();

                    System.out.print("New Course: ");
                    String course = sc.nextLine();

                    found.updateDetails(name, course);
                }
                else {
                    students.remove(found);
                    System.out.println("Student Deleted!");
                }
            }

            else if (choice == 6) {
                System.out.println("Thank You!");
            }

            else {
                System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
