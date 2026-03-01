package practice_8_hw.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 12, 29, 50);
        Map<Boolean, List<Integer>> groupedByIsEven = integerList.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(groupedByIsEven);
    }
}
