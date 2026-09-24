public class FindMissingNo {

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 6, 3};
        int arraySum = 0;
        for (int value : array)
            arraySum += value;

        int n = array.length + 1; // One number is missing
        int expectedSum = n * (n + 1) / 2;

        int missingNumber = expectedSum - arraySum;

        System.out.println("The given array is: ");
        for (int v : array)
            System.out.print(v + " ");
        System.out.println("\nMissing Number is: " + missingNumber);
    }
}