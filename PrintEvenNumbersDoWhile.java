import java.util.Scanner;

public class PrintEvenNumbersDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int i = 1;
        System.out.println("Even numbers up to " + number + ":");
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= number);
        scanner.close();
    }
}