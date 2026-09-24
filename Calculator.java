import java.util.Scanner;

public class Calculator {

    static float sum(float a, float b) {
        return a + b;
    }

    static float subtract(float a, float b) {
        return a - b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }

    static float divide(float a, float b) {
        if (b != 0) return a / b;
        else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    static float squareRoot(float a) {
        return (float) Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose operation:\n1. SUM\n2. SUBTRACT\n3. MULTIPLY\n4. DIVIDE\n5. SQUARE ROOT");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + sum(in.nextFloat(), in.nextFloat()));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + subtract(in.nextFloat(), in.nextFloat()));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + multiply(in.nextFloat(), in.nextFloat()));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + divide(in.nextFloat(), in.nextFloat()));
                break;
            case 5:
                System.out.println("Enter a number:");
                System.out.println("Result: " + squareRoot(in.nextFloat()));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        in.close();
    }
}