package practice_8_hw.part3;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 4, 10, 6);
        boolean check = integerList.stream()
                .anyMatch(x -> x % 2 == 0);

        System.out.println("Есть ли четные числа: " + check);

    }
}
