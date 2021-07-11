import java.util.*;

public class App {
    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                //Finding out the numbers till the arr[i] + arr[j] >= arr[k]
                while (k < n && arr[i] + arr[j] > arr[k])
                    ++k;
                if (k > j)
                    count += k - j - 1; //Calculating the possible cases as k is the index of last value possible for triangle
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 7, 8};
        System.out.println(findNumberOfTriangles(arr, arr.length));
    }
}
