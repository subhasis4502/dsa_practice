import java.util.*;
public class App {
    public static int missingNumber(int A[], int N)
    {
        //Without Sorting
        int actual_sum = 0;
        int sum = 0;
        for(int i = 0; i<=N; i++){
            actual_sum += i+1;
        }
        
        for(int i = 0; i<N; i++){
            sum += A[i];
        }
        
        return actual_sum-sum;

        /* //With Sorting
         Arrays.sort(A);
        for(int i = 0; i<N; i++){
            if(A[i] != i+1)
            return i+1;
        }
        return N; */
    }
         
    public static void main(String[] args) {
        int[] A = {1, 4, 3};
        System.out.println(missingNumber(A, A.length));
    }
}
