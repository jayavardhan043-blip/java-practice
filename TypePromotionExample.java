class Calculator {

    void display(long number) {
        System.out.println("Long method");
    }

    void display(double number) {
        System.out.println("Double method");
    }
}

public class TypePromotionExample {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(10);
    }
}