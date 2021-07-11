import java.util.*;

public class App {
    static int majorityElement(int a[], int size){

        ArrayList<Integer> al = new ArrayList<>(size);
        for (int i = 0; i < a.length; i++) {
            
        }
        if(a.length == 1)
            return a[0];
        int count = 1;
        Arrays.sort(a); //1, 2, 3, 3, 3
        int i = 0, j = 1;
        for(; i<size; i++){
            if(a[i] == a[j]){
                count++;
                j++;
                i--;
            }
            else
                j++;
            
            if(j>=size){
                if(count > (size/2))
                    return a[i+1];
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,1,3,3,2};
        
        System.out.println(majorityElement(a, a.length));
    }

}