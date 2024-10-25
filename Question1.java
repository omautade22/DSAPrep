import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {5,1,2,6,7};
        System.out.println(Arrays.toString(revArray(arr)));
    }

    static int[] revArray(int[] arr){
        int n = arr.length;

        if(n <= 0){
            return new int[] {-1};
        }

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[n - 1 - i];
        }

    
        return temp;
    }
}
