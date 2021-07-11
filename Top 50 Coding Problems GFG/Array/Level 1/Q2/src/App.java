public class App {

    static void display(int[] arr) {
        for (Integer val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    static void intialize(int[] arr, int start_val, int end_val) {
        int range = end_val - start_val + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + start_val;
        }
    }

    static void find_min(int[] arr){
        int min_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min_val)
                min_val = arr[i];
        }
        System.out.println("The minimum value is " + min_val);
    }

    static void find_max(int[] arr){
        int max_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max_val)
                max_val = arr[i];
        }
        System.out.println("The minimum value is " + max_val);
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        intialize(arr, 1, 10);
        display(arr);
        
        find_min(arr);
        find_max(arr);
    }
}
