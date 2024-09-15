public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null; 
        }
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return root = new Node(data);
        }

        if(root.data > data){
           root.left = insert(root.left, data);
        }
        else{
           root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null)return false;
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data < key){
            return search(root.right, key);
        }
        else{
            return true;
        }
    }

    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node InSuc = inorderSuccessor(root.right);
            root.data = InSuc.data;
           root.right = delete(root.right, InSuc.data);
        }

        return root;
    }

    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root= root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }

        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data+ " ");
            printInRange(root.right, x, y);
        }
        else if (root.data >= y){
            printInRange(root.left, x, y);
        }
        else{
            printInRange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values [] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        System.out.println(search(root, 4 ));

        delete(root, 5);
        inorder(root);
        System.out.println();

        printInRange(root, 2, 10);
    }
}
