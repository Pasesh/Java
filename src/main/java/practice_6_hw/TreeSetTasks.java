package practice_6_hw;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        //Задача 1
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(0);
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println("Множество: " + set);

        //Задача 2
        System.out.println(add(set, 5));

        //Задача 3
        if(!set.isEmpty()) {
            System.out.println("Smallest element: " + set.higher(3));
            System.out.println("Largest element: " + set.lower(3));
        }
    }
    public static TreeSet<Integer> add(TreeSet<Integer> set, int num){
        if(!set.contains(num)){
            set.add(num);
        }
        return set;
    }

}
