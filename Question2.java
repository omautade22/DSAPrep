
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8,9};
        min(arr);
        max(arr);
    }

    static void min(int[] arr){
        int mini = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < mini) {
                mini = j;
            }
        }
        System.out.println("The minimum element is: " + mini );
    }

    static void max(int[] arr){
        int maxi = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > maxi) {
                maxi = j;
            }
        }
        System.out.println("The maximum element is: " + maxi);
    }
}
