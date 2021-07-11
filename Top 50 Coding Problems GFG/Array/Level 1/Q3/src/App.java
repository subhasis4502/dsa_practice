public class App {

    static void display(int[] arr) {
        for (Integer val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    static void linear_intialize(int[] arr, int start_val, int gap) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start_val + i*gap;
        }
    }

    static void reverse_array(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        linear_intialize(arr, 1, 1);
        display(arr);
        reverse_array(arr);
        display(arr);
    }
}
