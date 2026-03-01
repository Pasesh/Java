package practice_8_hw.part3;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Лариса", "Анна", "Бореслав", "Иван", "Борис");
        String result = stringList.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElse("Ничего не найдено");

        System.out.println(result);
    }
}
