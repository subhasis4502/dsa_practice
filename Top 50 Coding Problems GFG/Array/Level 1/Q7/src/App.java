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

    static void sort_012(int[] arr){
        int count_0 = 0;
        int count_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                count_0++;
            else if(arr[i]==1)
                count_1++;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i < count_0)
                arr[i] = 0;
            else if(count_0 <= i && i < count_0 + count_1)
                arr[i] = 1;
            else
                arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        intialize(arr, 0, 2);
        display(arr);

        sort_012(arr);
        display(arr);
    }
}
