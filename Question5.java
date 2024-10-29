import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        sortNegative(arr);
    }

    static void sortNegative(int[] arr){
        //int count = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }

        list1.addAll(list2);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list1.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}