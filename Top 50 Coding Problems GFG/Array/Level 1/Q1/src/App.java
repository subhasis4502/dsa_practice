import java.lang.Math;

public class App {

    static void display(int[] arr) {
        System.out.println();
        for (Integer val : arr)
            System.out.print(val + " ");
    }

    static void linear_intialize(int[] arr, int start_val, int gap) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start_val + i*gap;
        }
    }

    static void intialize(int[] arr, int start_val, int end_val) {
        int range = end_val - start_val + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + start_val;
        }
    }

    static void key_segment(int[] arr, int val, double segment){
        double k = 0;
        int segment_no = 0;
        for (int i = 0; i < arr.length; i+=segment) {
            for (int j = 0; j < segment; j++) {
                //For the last smaller segment
                if(arr.length-1 < i+j)
                    break;
                if(arr[j+i]==val){
                    k++;
                    break;
                }
            }
        }
        if(k == Math.ceil((arr.length/segment)))
            System.out.println("\nYes");
        else
            System.out.println("\nNo");
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3, 2, 1};
        /* intialize(arr, 1, 4); */
        display(arr);
        key_segment(arr, 3, 3);
    }
}
