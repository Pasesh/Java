package practice_8_hw.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "kiwi", "orange", "kiwi", "banana");
        List<String> uniqueList = stringList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);
    }
}
