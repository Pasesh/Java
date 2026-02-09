package practice_6_hw;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTasks {
    public static void main(String[] args) {
        //Задача 1
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("D");
        deque.add("C");
        deque.add("E");
        deque.add("A");
        //Задача 1
        System.out.println(deque);
        System.out.println("Queue");

        while (!deque.isEmpty()){
            System.out.println(deque.removeFirst());
        }
        System.out.println();

        //Задача 2
        ArrayDeque<String> deque1 = new ArrayDeque<>();
        deque1.push("A");
        deque1.push("D");
        deque1.push("C");
        deque1.push("E");
        deque1.push("A");
        System.out.println(deque1);
        System.out.println("Stack");
        while (!deque1.isEmpty()){
            System.out.println(deque1.pop());
        }
    }
}
