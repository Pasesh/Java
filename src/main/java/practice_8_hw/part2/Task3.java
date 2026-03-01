package practice_8_hw.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("banana", "kiwi", "orange", "apple", "pear");
        List<Integer> integerList = stringList.stream()
                .map(String::length)
                .toList();

        System.out.println(integerList);
    }
}
