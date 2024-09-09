public class ImplimentTree {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void insert(int data){
        Node n = new Node(data);

        if(root == null){
            root = n;
            return;
        }

        Node current = root;
        
        while(true){

            if(data < current.data){
                if(current.left == null){
                    current.left = n;
                    return;
                }
                else{
                    current = current.left;
                }
            }
            else{
                if(current.right == null){
                    current.right = n;
                    return;
                }
                else{
                    current =current.right; 
                }
            }
        }
    }
    public void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        ImplimentTree t = new ImplimentTree();

        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(7);
        t.insert(8);
        t.insert(1);
        t.insert(5);
        t.insert(9);

        t.preorder(t.root);

    }
}
