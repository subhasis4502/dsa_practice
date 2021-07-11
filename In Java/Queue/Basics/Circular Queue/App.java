class CircularQueue{
    int[] values = new int[5];
    int start_index = 0;
    int end_index = -1;
    int rev_index = 0;

    void display(){
        System.out.println();
        if(start_index <= end_index){
            for (int i = start_index; i < end_index+1; i++) {
                System.out.print(values[i] + " ");
            }
            //To print the elements inserted at left of start_index
            if(rev_index != 0){
                for (int i = start_index-1; i >= start_index-rev_index; i--) {
                    System.out.print(values[i] + " ");
                }
            }
        }
        else
            System.out.println("The queue is empty");
    }

    void push(int val){
        if(end_index != values.length-1){
            end_index++;
            values[end_index] = val;
        }
        //To push the elements inserted at left of start_index when end side completed
        else if(end_index == values.length-1 && start_index !=0 && start_index - rev_index -1 >= 0){
            values[start_index - rev_index -1] = val;
            rev_index++;
        }
        else 
            System.out.println("\nThe queue is full");
    }

    void pop(){
        if(start_index <= end_index){
            //Shift the elemnts at left
            if(rev_index != 0)
                for (int i = start_index; i > start_index-rev_index; i--) 
                    values[i] = values[i-1];
            start_index++;
        }
        else
            System.out.println("\nNothing to pop");
    }
}

public class App {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();

        q.pop();
        q.pop();
        /* q.pop(); 
        q.pop(); 
        q.pop(); 
        q.pop();  */
        q.push(6);
        q.push(7);
        q.push(8);
        q.display();
    }
}
