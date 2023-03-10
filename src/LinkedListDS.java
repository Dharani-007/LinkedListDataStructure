class Node {
    public int data;
    public Node next;

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
        //Adding Data in Node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Insert Data from Last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}

public class LinkedListDS {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to LinkedList Data Structures Problems.");

        LinkedList linkedList = new LinkedList();

        //Insert 70, 50, 36 in Linked List Nodes
        linkedList.insertLast(56);
        linkedList.insertLast(30);
        linkedList.insertLast(70);

        linkedList.showLinkedList();
    }
}