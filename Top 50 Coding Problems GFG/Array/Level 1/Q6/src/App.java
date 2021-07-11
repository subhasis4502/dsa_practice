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

    static void frequency(int[] arr, int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val)
                count++;
        }
        System.out.println(val + " is occured for " + count + " times");
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        intialize(arr, 1, 6);
        display(arr);

        System.out.println();
        frequency(arr, 2);
    }
}
