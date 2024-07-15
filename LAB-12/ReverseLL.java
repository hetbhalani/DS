public class ReverseLL {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node n2 = new Node(data);

        if (head == null) {
            head = n2;
            return;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n2;

        }
    }

    public void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void reverse(){
        Node temp = head;
        Node prev = null;

        while(temp != null){
           Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL rl = new ReverseLL();
        rl.addLast(0);
        rl.addLast(1);
        rl.addLast(2);
        rl.addLast(3);
        rl.addLast(4);

        reverse();
        rl.printData();
    }    
}
