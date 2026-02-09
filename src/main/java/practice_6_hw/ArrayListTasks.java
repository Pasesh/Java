package practice_6_hw;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTasks {
    public static void main(String[] args) {
        //Задача 1
        ArrayList<Integer> arrayList =new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        arrayList.add(6);
        System.out.println("Массив: " + arrayList);

        //Задача 2
        ArrayList<Integer> arrayEven =new ArrayList<>();
        for (int n : arrayList){
            if(n % 2 == 0){
                arrayEven.add(n);
            }
        }
        System.out.println("Четные числа: " + arrayEven);


        //Задача 3
        ArrayList<String> arrayString =new ArrayList<>(Arrays.asList("A", "aB", "Caa", "Eaaa", "Daaaaa"));

        String longest = "";

        for (String s : arrayString){
            if(s.length() > longest.length()){
                longest = s;
            }
        }
        System.out.println("Самая длинная строка: " + longest);

        //Задача 4
        int sum = 0;

        for (int n : arrayList){
            sum += n;
        }
        System.out.println("Сумма чисел: " + sum);

        //Задача 5
        int maxNum = arrayList.getFirst();
        for(Integer n : arrayList){
            if(n > maxNum){
                maxNum = n;
            }
        }
        System.out.println("Максимальное число: " + maxNum);
    }
}
