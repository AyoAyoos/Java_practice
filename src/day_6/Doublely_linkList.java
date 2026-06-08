package day_6;

public class Doublely_linkList {
	



	    public static void main(String[] args) {

	        DoublyNode new1Node = new DoublyNode(10);
	        DoublyNode new2Node = new DoublyNode(20);

	    
	        new1Node.next = new2Node;
	        new2Node.prev = new1Node;

	    
	        System.out.println("First Node Data: " + new1Node.data);
	        System.out.println("Second Node Data: " + new2Node.data);

	       
	        if (new1Node.next != null) {
	            System.out.println("Next of First Node: " + new1Node.next.data);
	        }

	       
	        if (new2Node.prev != null) {
	            System.out.println("Previous of Second Node: " + new2Node.prev.data);
	        }
	    }
	}

	class DoublyNode {
	    int data;
	    DoublyNode next;
	    DoublyNode prev;

	    DoublyNode(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}