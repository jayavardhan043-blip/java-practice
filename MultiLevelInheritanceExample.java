class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void displayStudent () {
        System.out.println("Course: " + course);
    }
}

class CollegeStudent extends Student {
    String collegeName;

    void displayCollegeStudent() {
        System.out.println("College Name: " + collegeName);
    }
}

public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.name = "Jaya Vardhan";
        cs.course = "Java Programming";
        cs.collegeName = "XYZ College";

        cs.displayPerson();
        cs.displayStudent();
        cs.displayCollegeStudent();
}
}