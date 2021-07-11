public class App {
    static void merge(int arr[], int l, int m, int r)
    {
        int[] A = new int[m-l+1];
        int[] B = new int[r-m];
        
        for (int i = 0; i < A.length; i++)
            A[i] = arr[l + i];
        for (int i = 0; i < B.length; i++)
            B[i] = arr[m + 1 + i];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < A.length && j < B.length){
            if(A[i] < B[j]){
                arr[l+k] = A[i];
                i++;
            }
            else{
                arr[l+k] = B[j];
                j++;
            }
            k++;
        }
        
        while(i < A.length){
            arr[l+k] = A[i];
            i++;
            k++;
        }

        while(j < B.length){
            arr[l+k] = B[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid); //1 3 4
            mergeSort(arr, mid+1, r); //7 9
            merge(arr, l, mid, r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        mergeSort(arr, 0, 4);
    }
}
