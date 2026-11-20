public class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        void updateDetails(String newName, String newCourse) {
            name = newName;
            course = newCourse;
            System.out.println("Student Details Updated!");
}
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("-------------------");
    }
}
