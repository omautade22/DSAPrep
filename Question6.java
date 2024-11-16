
import java.util.HashSet;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,77,6,5};
        int[] arr2 = {4,2,33,58};
        union(arr1, arr2);
        System.out.println(" ");
        intersection(arr1, arr2);
    }

    static void union(int[] arr1, int[] arr2){

        HashSet<Integer> set = new HashSet<>();

        for (int j : arr1) {
            set.add(j);
        }

        for(int i : arr2){
            set.add(i);
        }

        for(int ele : set){
            System.out.print(ele + " ");
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void intersection(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
