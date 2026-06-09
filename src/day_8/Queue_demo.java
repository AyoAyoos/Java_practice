package day_8;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {

	
		public static void main(String[]args) {
			
			
			Queue queueObj =new LinkedList();
			
			queueObj.offer(10);
			queueObj.offer(20);
			queueObj.offer(30);
			queueObj.offer(80);
			queueObj.offer(70);
			queueObj.offer(90);
			queueObj.offer(25);
			
			System.out.println(queueObj);
			
			// removal
			
			System.out.println("removal of first of ele :: " + queueObj.poll());
			System.out.println("2removal of first of ele :: " + queueObj.poll());
			System.out.println("3removal of first of ele :: " + queueObj.poll());

			// traversing of queue
			
			while(!queueObj.isEmpty()) {
				System.out.println(queueObj.poll());
			}
			
			
			//to peak a element
			
			System.out.println(queueObj.peek());
			
			
		}
}
