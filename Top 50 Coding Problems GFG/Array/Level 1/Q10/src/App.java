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

    static void union(int[] arr1, int[] arr2){
        display(arr1);
        for (int i = 0; i < arr2.length; i++) { 
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j]){
                    count++;
                    break;
                }
            }
            if(count == 0)
                System.out.print(arr2[i] + " ");
        }
    }

    static void intersection(int[] arr1, int[] arr2){
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.print(arr2[j] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,3,5,7};

        /* linear_intialize(arr1, 1, 1);
        linear_intialize(arr2, 1, 2); */

        display(arr1);
        display(arr2);

        union(arr1, arr2);
        intersection(arr1, arr2);
    }


}
