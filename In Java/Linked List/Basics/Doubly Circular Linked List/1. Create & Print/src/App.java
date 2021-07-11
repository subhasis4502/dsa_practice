class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = this;
        this.prev = this;
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

    void reverse_display(Node head){
        Node n = head;
        while(n != null && n.prev != head){
            n = n.prev;
            System.out.println(n.data);
        }
        System.out.println(head.data);
    }
}

public class App {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();

        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;
        ll.head.prev = third;
        second.next = third;
        second.prev = ll.head;
        third.next = ll.head;
        third.prev = second;

        ll.display(ll.head);
        System.out.println();
        ll.reverse_display(ll.head);
    }
}
