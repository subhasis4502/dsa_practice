class Linked_List{
    Node head;

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        Linked_List l = new Linked_List();
        
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        l.head.next = second;
        second.next = third;

    }
}

