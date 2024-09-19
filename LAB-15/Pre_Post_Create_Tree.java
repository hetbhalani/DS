public class Pre_Post_Create_Tree {
    
    public static void main(String[] args) {
        int [] pre = {5,3,2,1,4,8,7};
        int [] post = {1,2,4,3,7,8,5};

        ConstructTree t = new ConstructTree();

        t.preorder(t.PrePostConstuct(pre,post));

    }
}   

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data  = data;
        this.left = null;
        this.right = null; 
    }
}

class ConstructTree{
    int preIn;
    int postIn;

    public ConstructTree(){
        preIn = 0;
        postIn = 0;
    }

    public Node PrePostConstuct(int [] pre, int [] post){
        Node root = new Node(pre[preIn++]);

        if(root.data != post[postIn]){
            root.left = PrePostConstuct(pre, post);
        }
        if(root.data != post[postIn]){
            root.right = PrePostConstuct(pre, post);
        }

        postIn++;

        return root;    
    }
    public void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}