public class App {
    static int binary_search(int arr[], int val, int start, int end){
        if(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == val)
                return mid;
            else if(arr[mid] > val)
                return binary_search(arr, val, start, mid-1);
            else
                return binary_search(arr, val, mid+1, end);
        }
        return -1;
    }
    
    static int search(int A[], int l, int h, int key)
    {
        int i = 0;
        //Searching the rotation point
        for(; i<h; i++){
            if(A[i] > A[i+1]){
                break;
            }
        }
        //Applying binary search in two segments
        if(key > A[0]){
            int val =  binary_search(A, key, 0, i);
            if(val == -1)
                return 0;
            return val;
        }
        else
            return binary_search(A, key, i, h-1);
    }

    public static void main(String[] args) {
        int[] A = {630, 631, 638, 641, 645, 648, 649, 650, 652, 382, 386};
        System.out.println(search(A, 0, A.length, 384));
    }
}
