public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Ramya", "CSE AIML");
        Student s2 = new Student(102, "Rahul", "CSE");

        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("-------------------------");

        s1.display();
        s2.display();
    }
}
