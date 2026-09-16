class Student {
    void display () {
        System.out.println ("No details");
    }

    void display (String name) {
        System.out.println ("Name:" + name);
    }

    void display (String name, int age) {
        System.out.println ("Name:" + name + " Age:" + age);
    }
}

public class StudentMethodOverloading {
    public static void main (String args[]) {
        Student s = new Student ();
        s.display ();
        s.display ("Jaya");
        s.display ("Jaya", 20);
    }
}