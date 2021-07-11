class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = this;
    }
}

class Linked_List{
    Node head;

    void display(Node head){
        Node n = head;
        while(n != null && n.next != head){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
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
        third.next = ll.head;

        ll.display(ll.head);
    }
}
