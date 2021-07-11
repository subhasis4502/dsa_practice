import java.util.*;
public class App {

    static int[] findTwoElement(int arr[], int n) {
        int[] total = {1, 0};
        
        //To find out the duplicate number
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i+1]){
                total[0] = arr[i];
                break;
            }
        }

        //To find out the missing number
        for (int i = 0; i < n-1; i++) {
            if(i+1 != arr[i] && i+1 != arr[i+1]){
                total[1] = i+1;
                break;
            }
            else
                total[1] = n;
        }
        
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
        //int[] arr = {2,2};
        //int[] arr = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int[] ans = new int[2];

        ans = findTwoElement(arr, arr.length);
        System.out.println(ans[0] + " " + ans[1]);
        
    }
}
