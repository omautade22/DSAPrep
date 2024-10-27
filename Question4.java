import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,1,0,2};
        sort012(arr);
    }

    static void sort012(int[] arr){
        int count0 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count0 = count0 + 1;;
            }
            else if(arr[i] == 1){
                count1 = count1+ 1;
            }
            else{
                count2 = count2 + 1;
            }
        }

        for(int i = 0; i < count0; i++){
            arr[i] = 0;
        }

        for(int i = count0; i < count1 + count0; i++){
            arr[i] = 1;
        }

        for(int i = count0 + count1; i < count2 + count1 + count0; i++){
            arr[i] = 2;
        }


        System.out.println(Arrays.toString(arr));
    }
}
