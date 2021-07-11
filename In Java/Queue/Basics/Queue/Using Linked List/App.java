import java.util.LinkedList;

class Queue{
    LinkedList<Integer> values = new LinkedList<>();
    int start_index = 0;
    int end_index = -1;

    void display(){
        if(start_index <= end_index){
            for (int i = start_index; i < end_index+1; i++) {
                System.out.print(values.get(i) + " ");
            }
            System.out.println();
        }
        else
            System.out.println("The queue is empty");
    }

    void push(int val){
        end_index++;
        values.add(val);
    
    }

    void pop(){
        if(start_index <= end_index)
            start_index++;
        else
            System.out.println("Nothing to pop");
    }
}

public class App {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.display();

        q.pop();
        q.display();
    }
}
