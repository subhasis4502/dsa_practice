import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "greeks";
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        
        String s = "";
        for (int i = arr.length-1; i >= 0; i--) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
