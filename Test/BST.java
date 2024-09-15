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
    }
}
