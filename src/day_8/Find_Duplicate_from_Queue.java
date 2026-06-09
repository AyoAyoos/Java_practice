package day_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Find_Duplicate_from_Queue {
	

		
		public static void main(String[]args) {
			
			
			Queue<Integer> queueObj = new LinkedList<>();
			
	        queueObj.offer(10);
	        queueObj.offer(20);
	        queueObj.offer(30);
	        queueObj.offer(80);
	        queueObj.offer(70);
	        queueObj.offer(90);
	        queueObj.offer(25);
	        queueObj.offer(20);
	        queueObj.offer(30);
	        queueObj.offer(90);
			
			
			System.out.println(queueObj);
			
			
			Queue<Integer> temp = new LinkedList<>(queueObj);

			while (!temp.isEmpty()) {

			    int current = temp.poll();
			    int count = 0;

			    for (int value : queueObj) {
			        if (value == current) {
			            count++;
			        }
			    }

			    if (count > 1) {
			        System.out.println(current + " is duplicate");
			    }
			}
		}
}