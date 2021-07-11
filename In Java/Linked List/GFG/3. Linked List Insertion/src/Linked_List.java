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
        System.out.println();
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    static Node insert_at_first(Node head, int val){
        Node new_node = new Node(val);
        Node n = head;
        head = new_node;
        head.next = n;
        return head;
    }

    static Node insert_at_end(Node head, int val){
        Node new_node = new Node(val);
        Node n = head;
        if(head == null){
            head = new_node;
            return head;
        }
        else{
            while(n.next != null){
                n = n.next;
            }
            n.next = new_node;
            new_node.next = null;
            return head;
        }
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();

        ll.head = new Node(1);
        traversal(ll.head);

        ll.head = insert_at_first(ll.head, 2);
        ll.head = insert_at_first(ll.head, 3);
        ll.head = insert_at_end(ll.head, 5);
        traversal(ll.head);
    }
}
