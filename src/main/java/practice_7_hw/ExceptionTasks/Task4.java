package practice_7_hw.ExceptionTasks;

import practice_7_hw.ExceptionTasks.Exp.InvalidDataException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void validateDate(String date) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        if (!matcher.matches()) {
            throw new InvalidDataException("Некорректная дата: " + date);
        }
        System.out.println("Корректная дата: " + date);
    }

    public static void main(String[] args) {

        try {
            validateDate("2025/02/15");
        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
