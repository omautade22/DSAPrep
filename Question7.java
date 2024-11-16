import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(bruteRotate(arr)));
    }

    static int[] bruteRotate(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // Save the last element

        // Shift all elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // Place the last element in the first position
        return arr;
    }
}
