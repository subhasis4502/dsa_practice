class Linked_List{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    static void traversal(Node head){
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    static Node deletion_at_first(Node head){
        head = head.next;
        return head;
    }

    static Node deletion_at_end(Node head){
        Node n = head;
        while(n.next.next != null){
            n = n.next;
        }
        n.next = null;
        return head;
    }

    static Node delete_at_val(Node head, int val){
        Node n1 = head;
        Node n2 = head.next;
        int i = 1;

        if(i == val){
            head = head.next;
            return head;
        }
        else{
            while(n2.next != null && i != val-1){
                n1 = n1.next;
                n2 = n2.next;
                i++;
            }
    
            if(n2.next != null){
                n1.next = n2.next;
                return head;
            }

            else
                return head;
        }
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.head = new Node(1); //Allocating the memory for head
        Node second = new Node(6);
        Node third = new Node(3);
        Node forth = new Node(9);

        ll.head.next = second;
        second.next = third;
        third.next = forth;

        traversal(ll.head);

        System.out.println();
        /* ll.head = deletion_at_first(ll.head);
        ll.head = deletion_at_end(ll.head); */
        ll.head = delete_at_val(ll.head, 3);
        traversal(ll.head);
    }
}