package practice_8_hw.part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 4, 10, 6);
        Integer minNumber = integerList.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(minNumber);
    }
}
