package KunalKushwaha;

public class CycleDetection {

    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node prev;
    private int size;

    public static boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }






}
