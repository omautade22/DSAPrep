
import java.util.Arrays;

public class Question5_1 {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        sortNegativeOptimal(arr);
    }

    static void sortNegativeOptimal(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
