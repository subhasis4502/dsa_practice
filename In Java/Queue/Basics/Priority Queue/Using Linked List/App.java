import java.util.LinkedList;

class PriorityQueue{
    LinkedList<int[]> values = new LinkedList<>();

    void display(){
        if(values.isEmpty())
            System.out.println("The queue is empty");
        else{
            for (int i = 0; i < values.size(); i++) {
                System.out.println("Priority: " + values.get(i)[0] + " Value: " + values.get(i)[1]);
            }
        }
    }

    void push(int prior, int val){
        int[] value = new int[2];
        value[0] = prior;
        value[1] = val;
        values.add(value);
    }

    void pop(){
        int min_prior = Integer.MAX_VALUE;
        for (int i = 0; i < values.size(); i++){
            if(values.get(i)[0] < min_prior)
                min_prior = values.get(i)[0];
        }

        if(values.isEmpty())
            System.out.println("Nothing to pop");
        else{
            for (int i = 0; i < values.size(); i++) {
                if(values.get(i)[0] == min_prior)
                    values.remove(i);
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.push(1, 1);
        pq.push(2, 2);
        pq.push(0, 3);
        pq.push(4, 3);
        pq.display();

        System.out.println();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.pop();
        pq.display();
    }
}
