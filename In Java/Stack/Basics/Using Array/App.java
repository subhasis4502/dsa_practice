class Stack{
    int[] values = new int[1000];
    int tos = -1;

    void display(){
        if(tos != -1){
            System.out.println("The stack contains:");
            for (int i = tos; i >= 0; i--) {
                System.out.println(values[i]);
            }
        }
        else
            System.out.println("Nothing in the stack");
    }

    Stack push(int val){
        if(tos != values.length){
            tos++;
            values[tos] = val;
            System.out.println(val + " is pushed");
        }
        else
            System.out.println("The stack is full");
        return this;
    }

    Stack pop(){
        if(tos != -1){
            System.out.println(values[tos] + " is popped");
            tos--;
        }
        else
            System.out.println("Nothing to pop");
        return this;
    }
}

class App{
    public static void main(String[] args) {
        Stack st = new Stack();
        st.display();
        System.out.println();

        st = st.push(1);
        st = st.push(2);
        st = st.push(3);
        st = st.push(4);
        st = st.push(5);
        System.out.println();
        st.display();

        System.out.println();
        st = st.pop();
        st = st.pop();
        st = st.pop();
        st = st.pop();
        st = st.pop();
        st = st.pop();
        st.display();
    }
}