package Aman;

public class AllLinkedList {
    Node head;
    Node tail;
    private void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
    }
    private void insertL(int value){
        Node node = new Node(value);
        if (tail==null){
            insert(value);
        }
        tail.next = node;
        tail = node;
    }
    private void DelF(){
        head = head.next;
    }
    private void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AllLinkedList LL = new AllLinkedList();
        LL.insert(5);
        LL.insert(20);
        LL.insert(90);
        LL.insert(35);
        LL.insert(52);
        LL.Display();
        LL.DelF();
        LL.Display();

    }
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next=next;
        }

    }
}
