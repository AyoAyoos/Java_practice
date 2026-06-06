package day_6;

public class middle_of_list {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(80);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        System.out.println("Linked List:");
        list.display();

        list.findMiddle();
    }
}

// Node Class
class MyNode {

    int data;
    MyNode next;

    public MyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List Class
class MyLinkedList {

    MyNode head;

    // Insert at End
    public void insertAtEnd(int data) {

        MyNode newNode = new MyNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        MyNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display Linked List
    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        MyNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find Middle Node
    public void findMiddle() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        MyNode slow = head;
        MyNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node = " + slow.data);
    }
}