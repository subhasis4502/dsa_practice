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

    //1. Rearrange an array such that arr[i] = i
    static void rearrange_array(int[] arr){
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    System.out.print(i + " ");
                    break;
                }
                if(c == arr.length-1)
                    System.out.print(-1 + " ");
                c++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        display(arr);

        rearrange_array(arr);
    }
}
