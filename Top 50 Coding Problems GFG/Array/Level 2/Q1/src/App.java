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

    //Juggling method 
    //Draw back the length of the array must be a multiple of rotation time
    static void rotate_right(int[] arr, int rotate){
        for (int j = 0; j < rotate; j++) {
            int temp = arr[j];
            for (int i = j; i < arr.length+rotate; i+=rotate) {
                if(i-rotate < 0)
                    temp = arr[i];
                else if(i >= arr.length)
                    arr[i-rotate] = temp;
                else
                    arr[i-rotate] = arr[i]; 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        linear_intialize(arr, 1, 1);
        display(arr);

        rotate_right(arr, 3);
        display(arr);
    }
}
