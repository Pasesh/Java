package practice_8_hw.part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Double avg = integerList.stream()
                .collect(Collectors.averagingInt(x -> x));

        System.out.println(avg);
    }
}
