package practice_8_hw.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 4, 10, 6);
        List<Integer> squareList = integerList.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(squareList);
    }
}
