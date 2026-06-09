package day_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Reverse_the_Queue queue : [10,40,60,50,70,80]    o/p : [80,70,50,60,40,10}
// 

public class Reverse_the_Queue {
	
	public static void main(String[]args) {
		
		
        Queue<Integer> queueObj = new LinkedList<>();
		
		queueObj.offer(10);
		queueObj.offer(40);
		queueObj.offer(60);
		queueObj.offer(50);
		queueObj.offer(70);
		queueObj.offer(80);
		
		
		System.out.println(queueObj);
		
		// removal
		
		Stack<Integer> stack = new Stack<>();

        // Step 1: Move queue -> stack
        while (!queueObj.isEmpty()) {
            stack.push(queueObj.poll());
        }

        // Step 2: Move stack -> queue
        while (!stack.isEmpty()) {
            queueObj.offer(stack.pop());
        }

        System.out.println("Reversed Queue : " + queueObj);
    }
}