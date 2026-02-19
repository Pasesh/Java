package practice_7_hw.ExceptionTasks;

import practice_7_hw.ExceptionTasks.Exp.InvalidAgeException;

public class Task3 {
    public static void validationAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 150){
            throw new InvalidAgeException("Некорректный возраст: " + age);
        }
        System.out.println("Корректный возраст: " + age);
    }

    public static void main(String[] args) {
        try {
            validationAge(158);
        }catch (InvalidAgeException e){
            System.err.println(e.getMessage());
        }
    }
}
