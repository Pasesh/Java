package practice_8_hw.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 12, 29, 50);
        List<Integer> filterList = integerList.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filterList);
    }
}
