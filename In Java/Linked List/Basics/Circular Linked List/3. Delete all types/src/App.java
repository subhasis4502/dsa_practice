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
        Node n = head;
        while(n.next != head){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    Node delete_at_first(Node head){
        Node n = head;
        while(n.next != head)
            n = n.next;
        head = head.next;
        n.next = head;
        return head;
    }

    Node delete_at_last(Node head){
        Node n = head;
        while(n.next.next != head){
            n = n.next;
        }
        n.next = head;
        return head;
    }

    Node delete_at_index(Node head, int index){
        if(index == 0)
            head = delete_at_first(head);
        else{
            Node n = head;
            int count = 1;
            while(count != index){
                n = n.next;
                count++;
            }
            n.next = n.next.next;
        }
        
        return head;
    }

    Node delete_at_value(Node head, int value){
        if(head.data == value)
            head = delete_at_first(head);
        else
        {
            Node n = head;
            while(n.next.data != value)
                n = n.next;
            n.next = n.next.next;
        }
        return head;
    }
    
}

class App{
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

        /* ll.head = ll.delete_at_first(ll.head);
        ll.display(ll.head);
        System.out.println(); */

        /* ll.head = ll.delete_at_last(ll.head);
        ll.display(ll.head);
        System.out.println(); */

        /* ll.head = ll.delete_at_index(ll.head, 1);
        ll.display(ll.head);
        System.out.println(); */

        ll.head = ll.delete_at_value(ll.head, 3);
        ll.display(ll.head);
        System.out.println();
    }
}