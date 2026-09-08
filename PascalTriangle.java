public class PascalTriangle {
    public static void main(String[] args) {
        int r = 4, i, j, k, number;
        for (i = 0; i < r; i++) {
            for (k = r; k > i; k--) {
                System.out.print(" ");
            }
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}