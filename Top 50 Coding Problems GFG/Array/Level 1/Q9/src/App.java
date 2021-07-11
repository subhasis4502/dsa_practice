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

    static void swap_negpos(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            if(arr[left] < 0 && arr[right] < 0)
                left++;

            else if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            else
                right--;

        }
        
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        intialize(arr, -5, 2);
        display(arr);

        swap_negpos(arr);
        display(arr);
    }
}
