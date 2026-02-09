package practice_6_hw;

import java.util.HashMap;

public class HashMapTasks {
    public static void main(String[] args) {
        //Задача 1
        HashMap<String, Integer> map = new HashMap<>();
        map.put("An", 15);
        map.put("Andrew", 25);
        map.put("John", 45);
        map.put("Lex", 19);
        map.put("Lola", 63);
        System.out.println(map);

        //Задача 2
        String foundName = "Lola";
        if(map.containsKey(foundName)){
            System.out.println(foundName + " найдена");
        }else {
            System.out.println(foundName + " НЕ найдена");
        }
    }
}
