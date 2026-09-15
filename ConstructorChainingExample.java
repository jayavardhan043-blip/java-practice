class Person {

    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {

    Student() {
        System.out.println("Student constructor");
    }
}

class CollegeStudent extends Student {

    CollegeStudent() {
        System.out.println("CollegeStudent constructor");
    }
}

public class ConstructorChainingExample {

    public static void main(String[] args) {

        CollegeStudent student = new CollegeStudent();
    }
}