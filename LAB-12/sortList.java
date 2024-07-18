public class SortList {
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

    public Node findmid(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node sort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = findmid(head);

        Node right = mid.next;
        mid.next = null;
        Node left = head;

        left = sort(left);
        right = sort(right);

        return merge(right, left);
    }

    Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) {
            temp.next = l1;
        } else {
            temp.next = l2;

        }
        return dummy.next;
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

    public static void main(String[] args) {
        SortList l1 = new SortList();

        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(6);
        l1.addLast(20);
        l1.addLast(4);

        l1.head = l1.sort(l1.head);

        l1.printData();
    }
}