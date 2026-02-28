package practice_8_hw.part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Лариса", "Инна", "Бореслав", "Иван", "Борис");
        Map<Character, List<String>> gropedByLetter = stringList.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));

        System.out.println(gropedByLetter);
    }
}
