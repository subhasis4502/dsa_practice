import java.util.LinkedList;

class DoubleEndedQueue{
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

    void push_first(int val){
        end_index++;
        values.addFirst(val);
    }

    void push_end(int val){
        end_index++;
        values.add(val);
    }

    void pop_first(){
        if(start_index <= end_index)
            start_index++;
        else
            System.out.println("Nothing to pop");
    }

    void pop_end(){
        if(start_index <= end_index)
            end_index--;
        else
            System.out.println("Nothing to pop");
    }
}

public class App {
    public static void main(String[] args) {
        DoubleEndedQueue q = new DoubleEndedQueue();
        q.push_end(1);
        q.push_end(2);
        q.push_end(3);
        q.push_end(4);
        q.display();

        q.push_first(0);
        q.display();

        q.pop_first();
        q.pop_first();
        q.display();

        q.pop_end();
        q.display();
    }
}
