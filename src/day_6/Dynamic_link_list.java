package day_6;

public class Dynamic_link_list {
	
	
		public static void main(String[] args) {
			SinglyLinkedListDemo linkedList=new SinglyLinkedListDemo();
			linkedList.insertAtBegining(10);
			linkedList.insertAtBegining(80);
			 linkedList.insertAtASpecificPosition(50, 2);
			linkedList.insertAtEnd(100);
			linkedList.insertAtEnd(30);
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
		
		public void insertAtEnd(int data) {
			LinkedNode newNode=new LinkedNode(data);
			if(head==null) {
				head=newNode;
				return;
			}
			LinkedNode temp_ref=head;
			while(temp_ref.next!=null) {
				temp_ref=temp_ref.next;
			}
			temp_ref.next=newNode;
			
		}
		
		public void insertAtASpecificPosition(int data, int position) {
	        LinkedNode newNode = new LinkedNode(data);
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        LinkedNode temp_ref = head;
	        for (int i = 0; temp_ref != null && i < position - 1; i++) {
	            temp_ref = temp_ref.next;
	        }
	        temp_ref.next = newNode;
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