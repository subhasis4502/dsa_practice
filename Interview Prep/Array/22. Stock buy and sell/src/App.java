import java.util.*;

public class App {
    //4,2,2,2,4
    static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer> > days = new ArrayList<>();

        //Finding the maximum value
        int max_val = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > max_val){
                max_val = A[i];
            }
        }

        //Storing the indexes where the max value exist
        ArrayList<Integer> max_val_index = new ArrayList<>(); 
        for (int i = 0; i < A.length; i++) {
            if(A[i] == max_val){
                max_val_index.add(i); //0,4
            }
        }

        //Finding the maximum value
        int min_val = A[1];
        for (int i = 0; i < n; i++) {
            if(A[i] < min_val){
                min_val = A[i];
            }
        }

        //Storing the indexes where the min value exist
        ArrayList<Integer> min_val_index = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(A[i] == min_val){
                min_val_index.add(i); //1,2,3
            }
        }

        //Make all the possible buy-sell combinations
        for (int i = 0; i < max_val_index.size(); i++) {
            for (int j = 0; j < min_val_index.size(); j++) {
                //Checking as we only sell after buying it
                if(max_val_index.get(i) > min_val_index.get(j)){
                    ArrayList<Integer> each_day = new ArrayList<>();
                    each_day.add(min_val_index.get(j));
                    each_day.add(max_val_index.get(i));
                    days.add(each_day);
                }
            }
            
        }

        return days;
    }

    public static void main(String[] args) {
        int[] A = {100,180,260,310,40,535,695};
        //int[] A = {4,2,2,2,4};
        ArrayList<ArrayList<Integer> > days = stockBuySell(A, A.length);

        int profit = 0;
        for (int i = 0; i < days.size(); i++) {
            System.out.println("Buy: " + days.get(i).get(0) + " Sell: " + days.get(i).get(1));
            profit += A[days.get(i).get(1)] - A[days.get(i).get(0)];
        }

        int p = 0;
        for (int i = 0; i < A.length-1; i++) {
            p += Math.max(0, A[i+1]-A[i]);
        }

        if(c==p)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
