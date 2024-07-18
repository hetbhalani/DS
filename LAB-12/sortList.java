public class sortList{
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
    public static void main(String[] args) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = findMid(head);
        Node right = mid.next;
        mid.next = null;
        Node left = head;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
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

    Node findMid(Node head) {
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
   }
