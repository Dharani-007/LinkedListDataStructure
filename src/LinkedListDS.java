class Node{
    private int data;
    private Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
    }
}

public class LinkedListDS {
    public static void main(String[] args) {

        System.out.println("Welcome to LinkedList Data Structures Problems.");

        LinkedList linkedList = new LinkedList();

        linkedList.insertFirst(56);
        linkedList.insertFirst(30);
        linkedList.insertFirst(70);


    }
}