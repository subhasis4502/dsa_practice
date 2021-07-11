class DoubleEndedQueue{
    int[] values = new int[100];
    int start_index = 0;
    int end_index = -1;

    void display(){
        if(start_index <= end_index){
            for (int i = start_index; i < end_index+1; i++) {
                System.out.print(values[i] + " ");
            }
            System.out.println();
        }
        else
            System.out.println("The queue is empty");
    }

    void push_first(int val){
        if(end_index != values.length){
            for (int i = end_index; i >= 0; i--) 
                values[i+1] = values[i];
            values[0] = val;
            end_index++;
        }
        else
            System.out.println("The queue is full");
    }

    void push_end(int val){
        if(end_index != values.length-1){
            end_index++;
            values[end_index] = val;
        }
        else
            System.out.println("The queue is full");
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
