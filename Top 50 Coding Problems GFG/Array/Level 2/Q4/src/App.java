import jdk.swing.interop.DispatcherWrapper;

public class App {
    
    static void display(int[] arr) {
        for (Integer val : arr)
            System.out.print(val + " ");
            System.out.println();
    }

    /* static void find_duplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        display(arr);

        System.out.print("The duplicate numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= arr.length*2)
                System.out.print(i + " ");
        }
    } */

    static void find_duplicates(int[] arr){
        int[] carr = new int[arr.length];
        int a = 0;

        System.out.print("Duplicate numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count != 0){
                int present = 0;
                for (int j = i+1; j < carr.length; j++) {
                    if(arr[i] == carr[j]){
                        present++;
                        break;
                    }
                    else{
                        carr[a] = arr[i];
                        a++;
                        break;
                    }
                }
                if(present == 0)
                    System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 6, 3, 6, 3, 1};
        display(arr);

        find_duplicates(arr);
    }
}

