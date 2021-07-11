public class App {
    static int trappingWater(int arr[], int n) { 
        int stored = 0;
        
        for (int i = 1; i < n-1; i++) {
            int j = i-1;
            int k = i+1;
            int left_wall = 0;
            int right_wall = 0;
            while(j != 0 && k != n-1){

                j--;
                k++;
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* for(int i = 1; i<n-1; i++){
            if(arr[i] < arr[i-1] || arr[i] < arr[i+1]){
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    stored += Math.min(arr[i+1], arr[i-1]) - arr[i];
                }
                else if(arr[i] > arr[i-1] && arr[i] < arr[i+1])
                    stored += arr[i+1] - arr[i];
                else if(arr[i] < arr[i-1] && arr[i] > arr[i+1])
                    stored += arr[i-1] - arr[i];
            }
        } */
        return stored;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {8, 8, 2, 4, 5, 5, 1};
        System.out.println(trappingWater(arr, arr.length));
    }
}
