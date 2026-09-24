class Details {
    void display (int age, String name) {
        System.out.println("Age:" + age);
        System.out.println("Name:" + name);
    }

    void display (String name, int age) {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

public class ParameterOverloading {
    public static void main(String[] args) {
        Details details = new Details();
        details.display(22, "Jaya");
        details.display("Rohith", 21);
    }
}