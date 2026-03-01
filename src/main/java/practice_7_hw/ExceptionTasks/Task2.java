package practice_7_hw.ExceptionTasks;

import java.util.Scanner;

public class Task2 {

    public static int divNumbers(int x, int y){
        if(y == 0){
            throw new ArithmeticException("Ошибка - деление на 0");
        }return x / y ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        try {
            System.out.println("Результат деления: " + divNumbers(num1, num2));
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        scanner.close();

    }
}
