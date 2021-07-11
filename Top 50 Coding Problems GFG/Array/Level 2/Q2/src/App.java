public class App {

    static void display(int[] arr) {
        for (Integer val : arr)
            System.out.print(val + " ");
        System.out.println();
    }
    
    static void missing_mun(int[] arr){
        System.out.print("Missing number: ");
        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(i == arr[j]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.print(i + " ");
            }
        }
    }

    //GFG Approach: Not applicable if we have more than one number missing
    /* static void missing_mun(int[] arr){
        int total_sum = 0;
        int sum = 0;
        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
            total_sum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Missing Number: " + (total_sum - sum));
    } */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 8};
        display(arr);

        missing_mun(arr);
    }
}
