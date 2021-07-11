public class App {
    
    static void display(int[] arr) {
        System.out.println();
        for (Integer val : arr)
            System.out.print(val + " ");
    }

    static void intialize(int[] arr, int start_val, int end_val) {
        int range = end_val - start_val + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + start_val;
        }
    }

    static void bubble_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void kth_smallest(int[] arr, int k){
        bubble_sort(arr);
        System.out.println(k + "th smallest element is " + arr[k-1]);
    }

    static void kth_largest(int[] arr, int k){
        bubble_sort(arr);
        System.out.println(k + "th largest element is " + arr[arr.length-k]);
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        intialize(arr, 1, 6);
        display(arr);

        System.out.println();
        kth_smallest(arr, 2);

        System.out.println();
        kth_largest(arr, 2);
    }
}
