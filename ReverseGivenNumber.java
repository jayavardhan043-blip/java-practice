import java.util.Scanner;

public class ReverseGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int reversed = reverse(n);
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }

    private static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
}