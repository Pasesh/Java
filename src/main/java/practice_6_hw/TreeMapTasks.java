package practice_6_hw;

import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        //Задача 1
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("An",10);
        map.put("Garry",2);
        map.put("Don",6);
        map.put("Lola",1);
        map.put("Anna",8);

        System.out.println(map);

        //Задача 2
        System.out.println("MinKey: " + map.firstKey());
        System.out.println("MaxKey: " + map.lastKey());

        //Задача 3
        TreeMap<Integer, String> employee = new TreeMap<>();
        employee.put(10,"al");
        employee.put(20,"ag");
        employee.put(30,"aa");
        employee.put(40,"af");
        employee.put(50,"av");
        System.out.println(employee.higherKey(3));
    }
}
