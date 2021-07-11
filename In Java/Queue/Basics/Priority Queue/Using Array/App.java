import java.util.ArrayList;

class PriorityQueue{
    ArrayList<int[]> values = new ArrayList<>();
    void display(){
        if(!values.isEmpty()){
            for (int i = 0; i < values.size(); i++) {
                System.out.println("Priority: " + values.get(i)[0] + " Value: " + values.get(i)[1]);
            }
        }
        else
            System.out.println("The queue is empty");
    }

    void push(int priority, int val){
        int[] input = {priority, val};
        values.add(input);
    }

    void pop(){
        for (int i = 0; i < values.size(); i++) {
            
        }
    }
}

public class App {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(); 
        int[] input = {1,1};
        q.values.add(input);
        /* q.push(2, 2); */ 
        q.push(0, 3);/*
        q.push(2);
        q.push(3); */
        q.display();
/* 
        q.pop();
        q.pop();
        q.pop();
        q.pop(); */
    }
}
