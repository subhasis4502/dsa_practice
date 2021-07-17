class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class App {
    public static Node removeDuplicates(Node head) 
    {
        int[] hash = new int[10];
        Node n = head;

        hash[n.data]++;
        while(n.next != null){
            if(hash[n.next.data] != 0){

                Node m = n.next;
                if(n.data == m.data){
                    while(m != null && n.data == m.data)
                        m = m.next;
                    n.next = m;
                }
                else{
                    n.next = n.next.next;
                }
            }
            else
                hash[n.next.data]++;
            if(n.next == null)
                break;
            n = n.next;
        }

        if(hash[n.data] != 0){
            n = null;
        }
        
        return head;
    }
    /* static Node removeDuplicates(Node head)
    {
    	Node n = head;
    	Node m = n.next;
    	
    	//'n' denotes the repeating node
    	while(n != null && n.next != null){
        	m = n.next;
        	//Finding the node whis doesn't have same value
        	while(m != null && n.data == m.data)
        	    m = m.next;
    	    n.next = m;
    	    n = n.next;
    	}
    	
    	return head;
    } */
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        removeDuplicates(a);
    }
}
