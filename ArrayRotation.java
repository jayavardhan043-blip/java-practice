import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        int n = arr.length;

        d = d % n;
        int[] rotated = new int[n];
        int index = 0;

        for (int i = n - d; i < n; i++) {
            rotated[index++] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            rotated[index++] = arr[i];
        }

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after " + d + " rotations:");
        System.out.println(Arrays.toString(rotated));
    }
}