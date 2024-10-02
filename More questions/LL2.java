package Aman;

public class LL2 {
    private Node head;
    private Node tail;
    public LL2(){
       // this.size = 0;
    }
    public void FirstInsert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }
    public void lastInsert(int value){
        Node node = new Node(value);
        if (tail == null){
            FirstInsert(value);
            return;
        }
        tail.next = node;
        
    }
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
        private Node(int value,Node next){
            this.value = value;
            //this.next = next;
        }
    }

}
