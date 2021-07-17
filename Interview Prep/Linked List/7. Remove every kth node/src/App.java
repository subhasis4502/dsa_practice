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

    Node delete(Node head, int k)
    {
    	Node n = head;
    	int count = 2;
    	while(n.next != null){
    	    if(count%k == 0){
    	        if(n.next.next != null){
        	        n.next = n.next.next;
        	        count++;
    	        }
    	        else{
    	            n.next = null;
    	        }
    	    }
    	    count++;
    	    n = n.next;
    	}
    	
    	return head;
    }

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
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);
        Node eightth = new Node(8);

        ll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eightth;
        ll.display(ll.head);
        System.out.println();

        ll.head = ll.delete(ll.head, 2);
        ll.display(ll.head);
    }
}
