public class SumOfDigits {
    public static void main(String[] args) {
        int m = 456, n, sum = 0;
        while (m > 0) {
            n = m % 10;
            sum += n;
            m /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}