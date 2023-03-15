package KunalKushwaha;

public class LinkedList {

    class Node {
        int val;
        Node next;

        public Node(int value) {
            this.val = value;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertRec(1,0);
        ll.insertRec(1,0);
        ll.insertRec(1,0);
        ll.insertRec(2,0);
        ll.insertRec(2,0);
        ll.insertRec(3,0);
        ll.insertRec(3,0);
        ll.insertRec(3,0);
        ll.insertRec(4,0);
        ll.display();

        ll.duplicates();
        ll.display();


    }



}

