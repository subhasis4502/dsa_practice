public class App {
    static int tran_search(int arr[], int low, int high){
        
        while(low < high){
            int mid = (low+high)/2;
            
            if(arr[mid] != arr[mid+1])
                return mid +1;
            else if(arr[mid] == arr[mid+1]){
                if(arr[mid+1] == 1)
                    return tran_search(arr, 0, mid);
                else
                    return tran_search(arr, mid+1, high);
            }
        }
        return -1;
    }
    static int transitionPoint(int arr[], int n) {
        if(arr[0] == 1)
            return 0;
        return tran_search(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(transitionPoint(arr, arr.length));
    }
}
