import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start value: ");
        int a = scanner.nextInt();
        System.out.print("Enter common ratio: ");
        int r = scanner.nextInt();
        System.out.print("Enter total terms (N): ");
        int N = scanner.nextInt();

        System.out.print(a + " ");
        for (int i = 1; i < N; i++) {
            a = a * r;
            System.out.print(a + " ");
        }

        scanner.close();
    }
}