public class Tree {

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

    public Node makeChilds(int [] a, int i){
        if(i>=a.length){
            return null;
        }
        Node n = new Node(a[i]);

        if(n.data == -1){
            return null;
        }

        n.left =  makeChilds(a,2*i+1);
        n.right =  makeChilds(a,2*i+2);

        return n;
    }

    public void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }

        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,-1,-1,-1,-1,-1,-1,-1,-1};
        Tree t1 = new Tree();

        t1.root = t1.makeChilds(ar,0);
        t1.preorder(t1.root);
        System.out.println();
        t1.inorder(t1.root);
        System.out.println();           
        t1.postorder(t1.root);

    }
}
