package practice_8_hw.part3;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 4, 10, 6);
        int sum  = integerList.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);
    }
}
