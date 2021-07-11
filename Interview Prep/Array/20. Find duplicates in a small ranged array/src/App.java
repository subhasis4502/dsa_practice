import java.util.*;

public class App {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr.length * 2) {
                al.add(i);
            }
        }
        
        if(al.isEmpty())
            al.add(-1);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};    
        ArrayList<Integer> al = duplicates(arr, arr.length);
        
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
