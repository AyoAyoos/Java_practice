package day_5;

public class SampleNodeDemo {

public static void main(String[] args) {
		
		SampleNode node1= new SampleNode(10);
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		SampleNode node2=new SampleNode(20);
		node1.next=node2;
		
		System.out.println("second node detail");
		System.out.println("first node data" +node1.data);
		System.out.println("second node data" +node1.next.data);
		System.out.println("second node ref" +node1.next.data);
		
		
	}
	
	 static class SampleNode{
		int data;
		SampleNode next;
		
		SampleNode(int data){
			this.data = data;
			this.next = null;
		}
	}

}