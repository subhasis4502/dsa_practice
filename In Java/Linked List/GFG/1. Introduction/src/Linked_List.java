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

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.head = new Node(1); //Allocating the memory for head
        Node second = new Node(2);
        Node third= new Node(3);

        ll.head.next = second;
        second.next = third;

        traversal(ll.head);
    }
}
