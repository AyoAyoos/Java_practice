package day_6;

public class Dynamic_link_list {
	
	public static void main(String[] args) {
		SinglyLinkedListDemo linkedList=new SinglyLinkedListDemo();
		linkedList.insertAtBegining(10);
		linkedList.insertAtBegining(80);
		linkedList.traverseSinglyList();

	}

}
class LinkedNode{
	int data;
	LinkedNode next;
	
	public LinkedNode (int data) {
		this.data=data;
		this.next=next;
	}
}

class SinglyLinkedListDemo{
	LinkedNode head;
	
	public void insertAtBegining(int data) {
		LinkedNode node=new LinkedNode(data);
		if(head==null) {
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
	
	public void traverseSinglyList() {
		if(head==null) {
			System.out.println("list is empty");
		}
		
		LinkedNode temp_head=head;
		
		while(temp_head != null) {
			System.out.println(temp_head.data);
			temp_head=temp_head.next;
		}
	}
}