package practice_8_hw.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "kiwi", "orange", "apple", "pear");
        List<String> filterList = stringList.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filterList);
    }
}
