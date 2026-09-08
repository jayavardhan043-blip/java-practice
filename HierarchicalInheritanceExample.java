class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class Tester extends Employee {

    void testSoftware() {
        System.out.println("Tester is testing software");
    }
}

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
        d.writeCode();

        Tester t = new Tester();

        t.work();
        t.testSoftware();
    }
}