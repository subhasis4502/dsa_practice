import java.util.LinkedList;

class Stack{
    LinkedList<Integer> values = new LinkedList<>();
    int tos = -1;

    void display(){
        if(tos != -1){
            for (int i = values.size()-1; i >= 0; i--) {
                System.out.println(values.get(i));
            }
        }
        else
            System.out.println("The stack is empty");
    }

    Stack push(int val){
        values.add(val);
        tos++;
        return this;
    }

    Stack pop(){
        if(tos != -1){
            values.removeLast();
            tos--;
        }
        else
            System.out.println("Nothing to pop");
        return this;
    }
}

class App{
    public static void main(String[] args) {
        LinkedList<Integer> values = new LinkedList<>();
        Stack s = new Stack();
        s.display();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();

        
        s.pop();
        s.pop();
        s.display();

        s.pop();
        s.pop();
    }
}