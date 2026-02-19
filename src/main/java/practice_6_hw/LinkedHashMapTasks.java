package practice_6_hw;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapTasks {
    public static void main(String[] args) {

        //Задача 1
        LinkedHashMap <String, String> map =new LinkedHashMap<>();
        map.put("1","A");
        map.put("5","E");
        map.put("2","D");
        map.put("9","T");
        map.put("3","A");
        System.out.println(map);

        //Задача,
        LinkedHashMap <String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Andrew","+7858");
        phoneBook.put("Zoy","+5693");
        phoneBook.put("Cleo","+1598");
        phoneBook.put("Orlan","+3698");
        phoneBook.put("Ziz","+9876");

        String found = "Ziza";
        if(phoneBook.containsKey(found)){
            System.out.println(found + "'s phone number is " + phoneBook.get(found));
        } else System.out.println("Contact not found.");

        //Задача 3
        LinkedHashMap <String, String> history = new LinkedHashMap<>();
        history.put("1","7858");
        history.put("2","5693");
        history.put("3","1598");
        history.put("4","3698");
        history.put("5","9876");
        history.put("6","858");
        history.put("7","693");
        history.put("8","598");
        history.put("9","698");
        history.put("10","9876");

        if(history.size() == 10){
            String firstKey = history.keySet().iterator().next();
            history.remove(firstKey);
        }
        history.put("23", "ASD");
        for(Map.Entry<String,String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}
