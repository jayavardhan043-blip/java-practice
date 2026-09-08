class Student {

    String name;
    int age;
    String course;

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Jaya";
        student.age = 21;
        student.course = "Java";

        student.displayDetails();
    }
}