import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(101, "Chathurasri", "CSE AIML");
        Student s2 = new Student(102, "Rahul", "CSE");

        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("1. Display Students");
        System.out.println("2. Search Student");
        System.out.println("3. Add Student");
        System.out.println("4. Update Student");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            s1.display();
            s2.display();
        }
        else if (choice == 2 || choice == 4) {

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            Student s = null;

            if (id == s1.id)
                s = s1;
            else if (id == s2.id)
                s = s2;

            if (s == null) {
                System.out.println("Student Not Found!");
            }
            else if (choice == 2) {
                s.display();
            }
            else {
                sc.nextLine();

                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Course: ");
                String course = sc.nextLine();

                s.updateDetails(name, course);
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

            Student s3 = new Student(id, name, course);

            System.out.println("Student Added Successfully!");
            s3.display();
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
