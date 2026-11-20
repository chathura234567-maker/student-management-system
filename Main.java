import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(101, "Chathurasri", "CSE AIML");
        Student s2 = new Student(102, "Rahul", "CSE");

        System.out.println("STUDENT MANAGEMENT SYSTEM");

        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        if (s1.id == searchId) {
            s1.display();
        }
        else if (s2.id == searchId) {
            s2.display();
        }
        else {
            System.out.println("Student Not Found!");
        }

        sc.close();
    }
}
