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

    Node insert_at_first(Node head, int val){
        Node new_node = new Node(val);
        //Connecting the last node with new head
        Node n = head;
        while(n.next != head)
            n = n.next;
        n.next = new_node;

        //Changing the head
        n = head;
        head = new_node;
        new_node.next = n;

        return head;
    }

    Node insert_at_end(Node head, int val){
        Node new_node = new Node(val);
        Node n = head;
        while(n.next != head){
            n = n.next;
        }
        n.next = new_node;
        new_node.next = head;
        return head;
    }

    Node insert_at_index(Node head, int val, int index){
        if(index == 0)
            head = insert_at_first(head, val);
        else{
            Node new_node = new Node(val);
            Node n = head;
            int count = 1;
            while(count != index){
                n = n.next;
                count++;
            }
            new_node.next = n.next;
            n.next = new_node;
        }
        return head;
    }

    Node insert_after_node(Node head, int val, int index){
        Node new_node = new Node(val);
        if(head.next == null)
            head = insert_at_end(head, val);
        else{
            Node n = head;
            int count = 1;
            while(count != index){
                n  = n.next;
                count++;
            }
            new_node.next = n.next;
            n.next = new_node;
        }
        return head;
    }

    Node insert_before_last_node(Node head, int val){
        Node new_node = new Node(val);
        if(head.next == null)
            head = insert_at_first(head, val);
        else{
            Node n = head;
            while(n.next.next != head){
                n  = n.next;
            }
            new_node.next = n.next;
            n.next = new_node;
        }
        return head;
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
        System.out.println();

        ll.head = ll.insert_at_first(ll.head, 0);
        ll.display(ll.head);
        System.out.println();

        ll.head = ll.insert_at_end(ll.head, 4);
        ll.display(ll.head);
        System.out.println();

        ll.head = ll.insert_at_index(ll.head, 9, 7);
        ll.display(ll.head);
        System.out.println();

        ll.head = ll.insert_after_node(ll.head, 5, 3);
        ll.display(ll.head);
        System.out.println();

        ll.head = ll.insert_before_last_node(ll.head, 8);
        ll.display(ll.head);
        System.out.println();
    }
}