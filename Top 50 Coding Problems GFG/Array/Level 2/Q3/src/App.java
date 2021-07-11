public class App {
    static void display(int[] arr) {
        
        for (Integer val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    static void pair_sum(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        display(arr);

        pair_sum(arr, sum);
    }
}
