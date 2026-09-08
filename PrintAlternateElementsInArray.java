import java.util.Scanner;

public class PrintAlternateElementsInArray {

    public static void main(String[] args) {
        int[] arr = createArr();
        printAlternate(arr);
    }

    private static int[] createArr() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length of Array: ");
        int count = scan.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
        scan.close();
        return a;
    }

    private static void printAlternate(int[] arr) {
        System.out.println("Alternate elements:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}