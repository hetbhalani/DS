public class CircularLL{
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

    public void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp.next != head) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Head");
    }

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

    public void insertAtLast(int data){
        Node n1 = new Node(data);

        if(head == null){
            n1.next = n1;
            head = n1;
            tail = n1;
        }

        tail.next = n1;
        n1.next = head;
        tail = n1;
    }

    public void delete(int index){
        if(head == null){
           System.out.println("Empty");
           return;
        }

        if(index == 0){
            head = head.next;
            if(head == null){

            }
        }

        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        CircularLL l1 = new CircularLL();

        l1.insertAtFirst(0);
        l1.insertAtFirst(1);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(4);
        l1.insertAtFirst(5);
        l1.insertAtFirst(6);

        // l1.insertAtLast(1);
        // l1.insertAtLast(2);
        // l1.insertAtLast(3);
        // l1.insertAtLast(4);
        

        l1.delete(10);

        l1.printData();
    }
}