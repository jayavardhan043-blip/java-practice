import java.util.Scanner;

public class SumAndAvgOfArray {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sr.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sr.nextInt();
            sum += arr[i];
        }

        float average = (float) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}