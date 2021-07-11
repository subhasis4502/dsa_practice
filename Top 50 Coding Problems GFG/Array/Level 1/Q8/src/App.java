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

    static int find_min(int[] arr){
        int min_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min_val)
                min_val = arr[i];
        }
        return min_val;
    }

    static int find_max(int[] arr){
        int max_val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max_val)
                max_val = arr[i];
        }
        return max_val;
    }

    static void range_coefficient(int[] arr){
        int min = find_min(arr);
        int max = find_max(arr);

        System.out.println("Range: " + (max-min));

        float coefficient = (float)(max - min)/(max + min);
        System.out.println("Coefficient: " + coefficient);
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        intialize(arr, 5, 10);
        display(arr);
        range_coefficient(arr);
    }
}
