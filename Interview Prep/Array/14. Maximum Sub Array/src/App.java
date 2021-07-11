import java.util.*;

public class App {
    static void findSubarray(int A[]) {
        ArrayList<Integer> a = new ArrayList<>();
        // Length of given array
        int l = A.length;
 
        int sum = 0, i = 0;
 
        int max = -1;
 
        // Traversing array
        while (i < l) {
            // Increment i counter to avoid
            // negative elements
            while (i < l && A[i] < 0) {
                i++;
                continue;
            }
            // Calculating sum of contiguous
            // subarray of non-negative
            // elements
            while (i < l && 0 <= A[i]) {
 
                sum += A[i];
                a.add(A[i]);
                i++;
 
                // Update the maximum sum
                max = Math.max(max, sum);
            }
 
            // Reset sum
            sum = 0;
        }
 
        // Return the maximum sum
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, -3, 9, 5, -6 };
        findSubarray(arr);
    }
}
