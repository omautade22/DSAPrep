//Kth element - Brute Force Approach

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {4,5,8,9,1,3};
        int k = 1;
        System.out.println(kthEle(arr, k));
    }

    static int kthEle(int[] arr, int k) {
        int n = arr.length;
        boolean swapped;

        // Continue looping until no swaps are made
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;  // Mark that a swap occurred
                }
            }
            // Reduce the range of comparison for each subsequent pass
            n--;
        } while (swapped); // Exit loop if no swaps occurred in the last pass

        return arr[k];
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
