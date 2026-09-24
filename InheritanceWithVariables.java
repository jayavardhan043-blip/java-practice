class Person {
    String name;
    int age;
}

class Student extends Person {
    String course;
}
public class InheritanceWithVariables {
    public static void main(String[] args) {
        Student s = new Student ();
        s.name = "Jaya";
        s.age = 21;
        s.course = "Java";

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Course: " + s.course);
    }
} 