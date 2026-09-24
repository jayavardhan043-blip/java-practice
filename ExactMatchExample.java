class Calculator {

    void display(int number) {
        System.out.println("Integer method");
    }

    void display(long number) {
        System.out.println("Long method");
    }
}

public class ExactMatchExample {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(10);
    }
}