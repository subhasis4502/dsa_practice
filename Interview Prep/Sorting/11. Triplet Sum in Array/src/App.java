import java.util.*;
public class App {
    public static boolean find3Numbers(int A[], int n, int X) { 
    
        Arrays.sort(A);
        for(int i = 0; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            while(k != j){
                if(A[i] + A[j] + A[k] == X)
                    return true;
                else if(A[i] + A[j] + A[k] < X)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(A, A.length, 13));
    }
}
