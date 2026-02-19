package practice_6_hw;

import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) {
        //Задача 1
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(0);
        set.add(2);
        System.out.println(set);

        //Задача 2
        HashSet<Integer> setNum = new HashSet<>();
        setNum.add(2);
        setNum.add(4);
        setNum.add(1);
        setNum.add(0);
        setNum.add(5);
        setNum.add(7);
        setNum.add(8);
        setNum.add(11);
        setNum.add(3);
        setNum.add(9);

        int foundNum = 55;
        if(setNum.contains(foundNum)){
            System.out.println("Число "  + foundNum + " содержится в множестве");
        }else {
            System.out.println("Число " + foundNum +" НЕ содержится в множестве");
        }

        //Задача 3
        List<String> listWithDuplicates = Arrays.asList("apple",
                "apple", "orange", "banana", "banana");
        Set<String> uniqueItems = removeDuplicates(listWithDuplicates);
        System.out.println("Unique items: " + uniqueItems);

        //Задача 4
        HashSet<String> names = new HashSet<>();
        names.add("Alla");
        names.add("Olga");
        names.add("Andrew");
        names.add("Zoya");
        names.add("Katya");

        Scanner scanner = new Scanner(System.in);
        String foundName = scanner.nextLine();

        if (names.contains(foundName)) {
            System.out.println("Имя " + foundName + " содержится в списке");
        } else {
            System.out.println("Имя " + foundName + " НЕ содержится в списке");
        }
    }
    public static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<>(input);
    }
}
