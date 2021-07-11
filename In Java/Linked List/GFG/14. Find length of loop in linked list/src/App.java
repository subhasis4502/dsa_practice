public class App {
    static class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    static int countNodesinLoop(Node head){
        Node slow = head;
        Node fast = head.next;
        int count = 1;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                Node n = slow;
                while(n.next != slow){
                    count++;
                    n = n.next;
                }
                break;
            }
        }
        return count;
    }

    static Node newNode(int key)
    {
        Node temp = new Node(key);
        return temp;
    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);
    
        /* Create a loop for testing */
        head.next.next.next.next.next = head.next;

        System.out.println(countNodesinLoop(head));
    }
}
