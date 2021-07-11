public class App {

    static void display(int[] arr) {
        for (Integer val : arr)
            System.out.print(val + " ");
            System.out.println();
    }

    static int partition(int[] arr, int start, int end){
        int pIndex = start;
        int pivot = end;
        for (int i = start; i <= end; i++) {
            if(arr[pivot] > arr[i]){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex++;
            }
        }
        int temp = arr[pIndex];
        arr[pIndex] = arr[pivot];
        arr[pivot] = temp;

        return pIndex;
    }

    static void quick_sort(int[] arr, int start, int end){

        int pIndex = partition(arr, start, end);
        while(start < end){
            partition(arr, start, pIndex-1);
            partition(arr, pIndex+1, end);
            break;
        }

    }
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        display(arr);

        quick_sort(arr, 0, arr.length-1);
        display(arr);
    }
}
