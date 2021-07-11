class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linked_List{
    Node head;

    void display(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}

public class App {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();

        ll.head = new Node(10);
        Node second = new Node(5);
        ll.head.next = second;
        Node third = new Node(15);
        second.next = third;

        ll.display(ll.head);
    }
}
