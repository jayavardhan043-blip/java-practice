class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;

        System.out.println("Employee constructor executed");
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {

        super(name, salary);

        this.programmingLanguage = programmingLanguage;

        System.out.println("Developer constructor executed");
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class ParameterizedSuperexample {

    public static void main(String[] args) {

        Developer developer = new Developer("Jaya", 45000, "Java");

        developer.display();
    }
}