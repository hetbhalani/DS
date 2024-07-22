public class DivideIntoTwoParts {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    // public void printData(){
    //     Node temp = head;

    //     if(head == null){
    //        System.out.println("Empty");
    //         return;
    //     }

    //     while (temp.next != head) {
    //         System.out.print(temp.data + "--> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("Head");
    // }

    public void insertAtFirst(int data){
        Node n1 = new Node(data);

        if(head == null){
            n1.next = n1;
            head = n1;
            tail = n1;
        }

        n1.next = head;
        head = n1;
        tail.next = head;
    }

    public void divide(){
        Node slow = head;
        Node fast = head;

        while(fast == head || fast == tail){
            slow  = slow.next;
            fast = fast.next.next;
        }
        Node temp2 = slow;
        slow.next = null;

        if(fast == tail){
            fast.next = null;
        }

        if(fast.next == tail){
            fast.next.next = null;
        }

        Node temp1 = head;
    }

   

    public static void main(String[] args) {
        
    }
}
