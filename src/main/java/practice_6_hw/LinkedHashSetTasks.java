package practice_6_hw;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
        //Задача 1
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("C");
        set.add("AX");
        set.add("CA");
        set.add("BCA");
        set.add("DE");
        System.out.println(set);

        //Задача 2
        addUnique(set,"CC");
        addUnique(set,"CA");
        System.out.println(set);

    }

    //Задача 2
    public static void addUnique(LinkedHashSet<String> set, String element){
        if(!set.contains(element)){
            set.add(element);
            System.out.println("Элемент добавлен");
        }else {
            System.out.println("Такой элемент уже есть");
        }
    }
}
