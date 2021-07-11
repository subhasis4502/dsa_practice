import java.util.*;
public class App {
    public static int minSwaps(int nums[])
    {
        int[] preHash = new int[20];
        int[] postHash = new int[20];
        int swapCount = 0;
        
        for(int i = 0; i<nums.length; i++){
            preHash[nums[i]] = i;
        }
        
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            postHash[nums[i]] = i;
        }
        
        for(int i = 0; i<nums.length; i++){
            if(preHash[nums[i]] != postHash[nums[i]]){
                swapCount ++;
                //Swapping
                /* int temp = preHash[nums[i]];
                preHash[nums[i]] = postHash[nums[i]];
                postHash[nums[i]] = temp; */
            }
        }
        
        return swapCount;
    }

    public static void main(String[] args) {
        int[] nums = {10, 19, 6, 3, 5};
        System.out.println(minSwaps(nums));
    }
}
