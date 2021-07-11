
public class Array {

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

    static void intialize(int[] arr, int start_val, int end_val) {
        int range = end_val - start_val + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + start_val;
        }
    }

    // 1. Program for array rotation
    static void rotate_left(int[] arr, int times) {
        for (int i = 0; i < times; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    }

    // 2. Reversal algorithm for array rotation
    static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void block_swap(int[] arr, int pivot){
        //Breaking down to A and B
        int[] A = new int[pivot];
        for (int i = 0; i < A.length; i++) {
            A[i] = arr[i];
        }
        int[] B = new int[arr.length - pivot];
        for (int i = 0; i < B.length; i++) {
            B[i] = arr[i+pivot];
        }

        //Condition: 1
        if(A.length < B.length){
            //Breaking into Bl and Br
            int[] Bl = new int[B.length - A.length];
            for (int i = 0; i < Bl.length; i++) {
                Bl[i] = B[i];
            }

            int[] Br = new int[A.length];
            for (int i = 0; i < Br.length; i++) {
                Br[i] = B[i + A.length + 1];
            }

            //Swapping
            for (int i = 0; i < Br.length; i++) {
                arr[i] = Br[i];
            }

            for (int i = 0; i < Bl.length; i++) {
                arr[i+ Br.length] = Bl[i];
            }

            for (int i = 0; i < A.length; i++) {
                arr[i+B.length] = A[i];
            }
        }

        //Condition: 2
        if(A.length > B.length){
            //Breaking into Al and Ar
            int[] Al = new int[B.length];
            for (int i = 0; i < Al.length; i++) {
                Al[i] = A[i];
            }

            int[] Ar = new int[A.length - B.length];
            for (int i = 0; i < Ar.length; i++) {
                Ar[i] = A[i + B.length];
            }

            //Swapping
            for (int i = 0; i < B.length; i++) {
                arr[i] = B[i];
            }

            for (int i = 0; i < B.length; i++) {
                arr[i+ B.length] = Ar[i];
            }

            for (int i = 0; i < Al.length; i++) {
                arr[i+A.length] = Al[i];
            }
        }
    }

    //Binary Search
    static int binary_search(int[] arr, int start, int end, int search_val) {
        if (end >= 1) {
            int pivot = start + (end - start) / 2;

            if (arr[pivot] == search_val)
                return pivot;

            if (arr[pivot] > search_val)
                return binary_search(arr, end, pivot - 1, search_val);

            return binary_search(arr, pivot + 1, end, search_val);
        }
        return -1;
    }

    // 5. Search an element in a sorted and rotated array
    static void rotated_binary_search(int[] arr, int rotation, int val){
        int index = 0;
        index = binary_search(arr, 0, arr.length-rotation, val);

        if(index == -1)
            index = binary_search(arr, arr.length-rotation, arr.length, val);
        System.out.println("\n" + index);

    }

    // 6. Given a sorted and rotated array, find if there is a pair with a given sum
    static void pair_sum(int[] arr, int pair_val) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (pair_val == arr[i] + arr[j]) {
                    System.out.println("There is a pair (" + arr[i] + " , " + arr[j] + ") with sum " + pair_val);
                }
            }
        }
    }

    // 7. Find maximum value of Sum( i*arr[i]) with only rotations on given array
    // allowed
    static int max_rotate_sum(int[] arr) {
        int max_val = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += i * arr[i];
            }

            if (sum > max_val) {
                max_val = sum;
            }
            rotate_left(arr, 1);
        }
        return max_val;
    }

    // 8. Maximum sum of i*arr[i] among all rotations of a given array
    static void sum_ixarr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += j * arr[j];
            }
            System.out.println("The sum for rotation " + i + ": " + sum);
            rotate_left(arr, 1);
        }
    }

    static boolean array_compare(int[] arr, int[] check_arr) {
        for (int i = 0; i < check_arr.length; i++) {
            if (arr[i] == check_arr[i])
                ;
            else
                return false;
        }
        return true;
    }

    // 9. Find the Rotation Count in Rotated Sorted array
    static void rotation_count(int[] arr, int[] check_arr) {
        int rotation_count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (array_compare(arr, check_arr)) {
                System.out.println("The array has been rotated " + rotation_count + " number of times");
                break;
            } else {
                rotate_left(arr, 1);
                rotation_count++;
            }
        }
    }

    // To copy a array
    static void copy_array(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    // 10. Quickly find multiple left rotations of an array
    static void multiple_left_rotate(int[] arr, int[] count_arr) {
        for (int i = 0; i < count_arr.length; i++) {
            System.out.println();
            int[] arr1 = new int[arr.length];
            copy_array(arr, arr1);
            rotate_left(arr1, count_arr[i]);
            display(arr1);
        }
    }

    // 11. Find the minimum element in a sorted and rotated array
    static void rotate_array_min(int[] arr) {
        int min_val = arr[0];
        for (int i = 0; i < arr.length; i++) {
            rotate_left(arr, 1);
            if (arr[0] < min_val) {
                min_val = arr[0];
            }
        }
        System.out.println("\nThe minimum element is: " + min_val);
    }

    // 12. Reversal algorithm for right rotation of an array
    static void rotate_right(int[] arr, int times) {
        for (int i = 0; i < times; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
        }
    }

    static void sort_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    // 13. Find a rotation with maximum hamming distance
    static void max_haming_distance(int[] arr) {
        int haming_distance = 1;
        sort_array(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                haming_distance++;
            }
        }
        System.out.println("\nMax hamming distance: " + haming_distance);
    }

    //14. Queries on Left and Right Circular shift on array
    static void sum_subarray(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i < end+1; i++) {
            sum += arr[i];
        }
        System.out.println("\nThe sum of all integers in the subarray from " + start + " to " + end + " is " + sum);
    }

    //15. Print left rotation of array in O(n) time and O(1) space
    static void print_rotate_left(int[] arr, int times){
        for (int i = times; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        for (int i = 0; i < times; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    //Rotate the array only in the given range
    static void right_rotation_range(int[] arr, int start_range, int end_range){
        int temp = arr[end_range];
        for (int i = end_range - 1; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[start_range] = temp;
    }

    //16. Find element at given index after a number of rotations
    static void find_element(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val)
                System.out.println("\nThe element " + val + " found at index " + i);
        }
    }

    static void split_join(int[] arr, int position){
        int[] arr1 = new int[position+1];
        for (int i = 0; i <= position; i++) {
            arr1[i] = arr[i];
        }

        for (int i = position+1; i < arr.length; i++) {
            arr[i-position-1] = arr[i];
        }

        int c = 0;
        for (int i = arr.length-position-1; i < arr.length; i++) {
            arr[i] = arr1[c];
            c++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("Initial array:");
        display(arr);

        /* System.out.println("\n\nAfter rotating for 2 times: ");
        rotate_left(arr, 2);
        display(arr); */
        /*
        System.out.println("\n\nAfter reversal:"); reverse(arr);
        
        int result = binary_search(arr, 0, arr.length - 1, 50); if (result == -1)
        System.out.println("\n\nElement not present"); else
        System.out.println("\n\nElement found at index " + result);
         
        pair_sum(arr, 50);
         
        System.out.println("Max sum possible: " + max_rotate_sum(arr));
        
        sum_ixarr(arr);
         
        int[] check_arr = {30, 40, 50, 60, 70, 0, 10, 20};
        
        rotation_count(arr, check_arr);
        
        int[] count_arr = {1, 3, 4, 6};
        
        multiple_left_rotate(arr, count_arr);
        
        rotate_array_min(arr);
        */

        /* rotate_right(arr, 3);
        display(arr);

        int[] arr1 = { 1, 4, 4, 5, 6, 4, 9 };

        max_haming_distance(arr1); */

        /* sum_subarray(arr, 2, 5);
        print_rotate_left(arr, 2); */

        /* right_rotation_range(arr, 0, 2);
        display(arr);
        right_rotation_range(arr, 0, 3);
        display(arr);
        find_element(arr, 40); */

        /* rotate_left(arr, 3);
        display(arr);

        rotated_binary_search(arr, 3, 20); */

        /* split_join(arr, 2);
        display(arr); */

        block_swap(arr, 7);
        display(arr);

    }
}
