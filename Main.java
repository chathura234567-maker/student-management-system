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

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            s1.display();
            s2.display();
        }
        else if (choice == 2) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            if (id == s1.id)
                s1.display();
            else if (id == s2.id)
                s2.display();
            else
                System.out.println("Student Not Found!");
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
