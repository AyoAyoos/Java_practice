package day_8;


import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo {

    public static void main(String[] args) {
    	
    	   PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {

               @Override
               public int compare(Integer a, Integer b) {
                   return b - a;   // Descending order
               }
           });

           priorityQueue.offer(10);
           priorityQueue.offer(50);
           priorityQueue.offer(60);
           priorityQueue.offer(3);
           priorityQueue.offer(7);
           priorityQueue.offer(9);
           priorityQueue.offer(15);

           while (!priorityQueue.isEmpty()) {
               System.out.print(priorityQueue.poll() + " ");
           }
       }
   }