package day_5;



//WAP to store any format of data in linked list with 2 node

public class Store_data_in_linked_list {
	
	
	    public static void main(String[] args) {

	        // Node 1 stores String
	        Node node1 = new Node("Ayush");

	        // Node 2 stores Integer
	        Node node2 = new Node(101);

	        // Link nodes
	        node1.next = node2;

	        // Print data
	        System.out.println("Node 1 Data: " + node1.data);
	        System.out.println("Node 2 Data: " + node2.data);
	    }
	}

	class Node {

	    Object data;
	    Node next;

	    Node(Object data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	


