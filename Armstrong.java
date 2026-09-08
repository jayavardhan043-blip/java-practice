public class Armstrong {
    public static void main(String[] args) {
        int number = 371, originalNumber = number, remainder, result = 0;
        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }
        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number.");
        else
            System.out.println(originalNumber + " is not an Armstrong number.");
    }
}