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


    



}

