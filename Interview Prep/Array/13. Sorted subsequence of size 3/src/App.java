import java.util.*;

public class App {

    //Bruteforce Method:
    //1. Taking all the possible conditions and check arr[i] < arr[j] < arr[j]
    //2. If condition satisfied add them to a new array list and return
    /* static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> new_arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr.get(i) < arr.get(j) && arr.get(j) < arr.get(k)){
                        new_arr.add(arr.get(i));
                        new_arr.add(arr.get(j));
                        new_arr.add(arr.get(k));
                        break;
                    }
                }
            }
        }
        return new_arr;
    } */

    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n){
        int a1 = Integer.MAX_VALUE;
        int a2 = Integer.MAX_VALUE;
        int a3 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(a1 >= arr.get(i)){
                a1 = arr.get(i);
            }
            else if(a2 >= arr.get(i)){
                a2 = arr.get(i);
            }
            else{
                a3 = arr.get(i);
            }
        }
        ArrayList<Integer> new_arr = new ArrayList<>();
        if(a1 != Integer.MAX_VALUE && a2 != Integer.MAX_VALUE && a3 != Integer.MAX_VALUE){
            new_arr.add(a1);
            new_arr.add(a2);
            new_arr.add(a3);
        }
        return new_arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(33, 24, 92, 74, 100, 72, 72, 97, 54, 77, 95, 52, 11, 95, 29));

        arr = find3Numbers(arr, arr.size());

        if (!arr.isEmpty())
            for (int i = 0; i < arr.size(); i++)
                System.out.println(arr.get(i));
        else
            System.out.println(-1);
    }
}
