import java.util.*;

public class App {

    static public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int val) {
        // 2 3 4 5 7 8 10
        // i j k       l
        
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        for(int i = 0; i<arr.length-3; i++){
            for(int j = i+1; j<arr.length-2; j++){
                int k = j+1;
                int l = arr.length - 1;
                while(k < l){
                    if(arr[i] + arr[j] + arr[k] + arr[l] < val)
                        k++;
                    
                    else if(arr[i] + arr[j] + arr[k] + arr[l] > val)
                        l--;
                    
                    else{
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        ans.add(arr[l]);
                        
                        answer.add(ans);
                        k++;
                        l--;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        //int[] arr = {10,2,3,4,5,7,8};
        int[] arr = {88, 84, 3, 51, 54, 99, 32, 60, 76, 68, 39, 12, 26, 86, 94, 39, 95, 70, 34, 78, 67, 1, 97, 2, 17, 92, 52};

        ArrayList<ArrayList<Integer>> answer = fourSum(arr, 179);
    }
}
