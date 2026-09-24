public class PrintElementsInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // initialization of elements in an array
        printArr(array);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // printing the array elements using for loop
        }
    }
}