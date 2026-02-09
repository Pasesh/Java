package practice_6_hw;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(6);
        queue.offer(2);
        queue.offer(3);
        queue.offer(1);

        System.out.println("Очередь: " + queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
