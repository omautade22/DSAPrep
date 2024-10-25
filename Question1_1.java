
public class Question1_1 {
    public static void main(String[] args) {
        String str = "hello";
        revString(str);
    }

    static void revString(String str){
        String newStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }
}
