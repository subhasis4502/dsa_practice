import java.util.*;

public class App {
    static int maxIndexDiff(int arr[], int n) { 
        int []maxFromEnd = new int[n + 1];
        Arrays.fill(maxFromEnd, Integer.MIN_VALUE);
        
        //Convert it to the monotonous decreasing array
        for (int i = n - 1; i >= 0; i--)
            maxFromEnd[i] = Math.max(maxFromEnd[i + 1], arr[i]);
         
        int result = 0;
     
        for (int i = 0; i < n; i++)
        {
            int low = i + 1, high = n - 1,
            ans = i;
     
            //Applying binary search
            while (low <= high){
                int mid = (low + high) / 2;
     
                //Checking the given condition
                if (arr[i] <= maxFromEnd[mid]){
                    ans = Math.max(ans, mid);
                    low = mid + 1;
                }
                else
                    high = mid - 1;
         
                // Keeping a track of the
                // maximum difference in indices
                result = Math.max(result, ans - i);
            }
        }
          
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr, arr.length));
    }
}
