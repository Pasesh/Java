package practice_6_hw;

import java.util.HashSet;

public class HashSetTasks {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(0);
        set.add(2);
        System.out.println(set);

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
        };
    }
}
