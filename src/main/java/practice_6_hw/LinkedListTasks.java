package practice_6_hw;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
        //Задача 1
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("Z");
        System.out.println("Список: " + list);

        //Задача 2
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Помыть полы");
        tasks.add("Помыть посуду");
        tasks.add("Пропылесосить");

        while (!tasks.isEmpty()){
            System.out.println("Process: " + tasks.poll());
        }

        //Задача 3
        System.out.println("Первый элемент списка: " + list.getFirst());
        System.out.println("Последний элемент списка: " + list.getLast());

        //Задача 4
        LinkedList<Integer> listNum = new LinkedList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);

         int sum = 0;
         for (int n : listNum){
             sum += n;
         }
        System.out.println("Сумма элементов списка: " + sum);

         //Задача 5
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()){
            System.out.println("Проход вперед по элементам: " + it.next());
        }
        while (it.hasPrevious()){
            System.out.println("Проход назад по элементам: " + it.previous());
        }
    }
}
