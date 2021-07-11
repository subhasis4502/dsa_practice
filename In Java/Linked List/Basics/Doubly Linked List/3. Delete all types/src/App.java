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

    Node delete_at_first(Node head){
        head = head.next;
        return head;
    }

    Node delete_at_last(Node head){
        Node n = head;
        while(n.next.next != null){
            n = n.next;
        }
        n.next = null;
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
            n.next.prev = n;
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
            if(n.next.next != null){
                n.next = n.next.next;
                n.next.prev = n;
            }
            //If given index is the last node
            else
                delete_at_last(head);
        }
        return head;
    }
    
}

class App{
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();

        ll.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        ll.head.next = second;
        second.next = third;
        second.prev = ll.head;
        third.prev = second;
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