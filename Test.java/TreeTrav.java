import java.util.Scanner;

public class TreeTrav {
    public static void main(String[] args) {
        createTree();
    }
    static Node createTree(){
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);

        System.out.println("Enter data for Left: " + data);
        root.left = createTree();
        
        System.out.println("Enter data for Right: " + data);
        root.right = createTree();
        return root;
    }
}

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }
}