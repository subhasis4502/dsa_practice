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

class BinarySearchTree{
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

    boolean isBst(Node root){
        if(root != null){
            //Checking the left sub-tree
            if(!isBst(root.left))
                return false;

            //Checking the right sub-tree
            if(!isBst(root.right))
                return false;

            //Checking root is greater than its left node
            if(root.left != null && root.data < root.left.data)
                return false;
            
            //Checking root is lesser than its right node
            if(root.right != null && root.data > root.right.data)
                return false;
            return true;
        }
        return true;
    }

    boolean search(Node root, int val){
        if(root == null)
            return false;
        if(root.data == val)
            return true;
        else if(val < root.data)
            return search(root.left, val);
        else if(val > root.data)
            return search(root.right, val);
        else
            return false;
        
    }

    boolean searchItr(Node root, int val){
        while(root != null){
            if(root.data == val)
                return true;
            else if(val < root.data)
                root = root.left;
            else
                root = root.right;
        }
        return false;
    }

    Node insert(Node root, int val){

        if(root != null){
            if(root.data == val){
                System.out.println("Already present");
                return root;
            }

            else if(val < root.data)
                root.left = insert(root.left, val);
            
            else
                root.right = insert(root.right, val);

            return root;
        }
        else{
            root = new Node(val);
            System.out.println(val + " inserted successfully");
            return root;
        }
    }

    //Finding the right most leaf of left sub-tree
    Node inOrderPre(Node root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    Node delete(Node root, int val){
        //For blank tree
        if(root == null){
            return null;
        }

        //For leaf node
        if(root.left == null && root.right == null){
            root = null;
            return root;
        }
        
        //Searching the value
        if(val < root.data){
            root.left = delete(root.left, val);
        }
        
        else if(val > root.data){
            root.right = delete(root.right, val);
        }
        
        //Deleting the value
        else{
            Node inPre = inOrderPre(root); //Finding the in-order predecessor
            root.data = inPre.data; //Copy the new value of root
            root.left = delete(root.left, inPre.data); //Deleting that node recusively
        }

        return root;
    }

}


/* 
         4
       /   \
      2     6
     / \   / \
    1   3 5   7
*/
public class App {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.root = new Node(4);

        bt.root.left = new Node(2);
        bt.root.right = new Node(6);

        bt.root.left.left = new Node(1);
        bt.root.left.right = new Node(3);

        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(7);

        System.out.print("Preorder Traversal: ");
        bt.preOrderTraversal(bt.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        bt.postOrderTraversal(bt.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        bt.inOrderTraversal(bt.root);
        System.out.println();

        if(bt.isBst(bt.root))
            System.out.println("It is a binary tree");
        else
        System.out.println("It is not a binary tree");

        System.out.println(bt.search(bt.root, 5));
        System.out.println(bt.searchItr(bt.root, 7));

        bt.root = bt.insert(bt.root, 0);
        bt.root = bt.insert(bt.root, 4);
        bt.root = bt.insert(bt.root, 9);
        System.out.print("Inorder Traversal: ");
        bt.inOrderTraversal(bt.root);
        System.out.println();

        bt.delete(bt.root, 4);
        //bt.delete(bt.root, 9);
        //bt.delete(bt.root, 0);
        //bt.delete(bt.root, 10);
        System.out.print("Inorder Traversal: ");
        bt.inOrderTraversal(bt.root);
    }
}