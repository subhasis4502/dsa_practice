class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        data = val;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;

    void preOrderTraversal(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    void postOrderTraversal(Node root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}

public class App {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        System.out.print("Preorder Traversal: ");
        bt.preOrderTraversal(bt.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        bt.postOrderTraversal(bt.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        bt.inOrderTraversal(bt.root);
    }
}
