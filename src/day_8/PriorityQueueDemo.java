package day_8;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(10);
        priorityQueue.offer(50);
        priorityQueue.offer(60);
        priorityQueue.offer(3);
        priorityQueue.offer(7);
        priorityQueue.offer(9);
        priorityQueue.offer(15);

        System.out.println(priorityQueue);
    }
}