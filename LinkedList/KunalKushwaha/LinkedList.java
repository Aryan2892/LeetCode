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

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (tail != null) {
            tail.next = n;
        }
        if (tail == null || size == 0) {
            head = n;
        }
        tail = n;
        size++;
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


    //Leetcode Question 83. Remove Duplicates from Sorted List
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

    //21. Merge Two Sorted Lists
    public static LinkedList merge(LinkedList first, LinkedList second){
        Node f = first.head;
        Node s = second.head;

        LinkedList ans = new LinkedList();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.addAtTail(f.val);
                f = f.next;
            } else {
                ans.addAtTail(s.val);
                s = s.next;
            }
        }

            while (f != null){
                ans.addAtTail(f.val);
                f = f.next;
            }

            while (s!=null){
                ans.addAtTail(s.val);
                s = s.next;
            }
        return ans;
    }


    public static void main(String[] args) {
        //Question 83
        /*LinkedList ll = new LinkedList();
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
        ll.display();*/

        //Question 21
        LinkedList first = new LinkedList();
        LinkedList sec = new LinkedList();

        first.addAtTail(1);
        first.addAtTail(3);
        first.addAtTail(5);

        sec.addAtTail(1);
        sec.addAtTail(2);
        sec.addAtTail(9);
        sec.addAtTail(14);

        first.display();
        sec.display();

        LinkedList a = merge(first,sec);
        a.display();
    }



}

