class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
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

        ll.head = new Node(1);
        Node second = new Node(2);
        ll.head.next = second;
        Node third = new Node(3);
        second.next = third;
        third.prev = second;

        ll.display(ll.head);
    }
}
