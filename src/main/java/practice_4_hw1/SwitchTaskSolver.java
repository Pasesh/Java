package practice_4_hw1;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        //Вывод дня недели по номеру
        System.out.println(determineDateOfWeek());

        //Стоимость билета по дню недели
        System.out.println(getTicketPrice());

        //Перевод числовых оценок в буквенные (A–F)
        System.out.println(convertScore());

        //Обработка текстовых команд
        System.out.println(handleCommand());

        //Простой калькулятор с использованием switch
        System.out.println(calculate());



    }

    public static String determineDateOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String description;

        switch (day) {
            case 1 -> description = "Понедельник";
            case 2 -> description = "Вторник";
            case 3 -> description = "Среда";
            case 4 -> description = "Четверг";
            case 5 -> description = "Пятница";
            case 6 -> description = "Суббота";
            case 7 -> description = "Воскресенье";
            default -> description = "Неверный день недели";
        }
        return description;
    }

    public static String getTicketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String description;

        switch (day) {
            case 1, 2, 3, 4, 5 -> description = "300 рублей";
            case 6, 7 -> description = "450 рублей";
            default -> description = "Введен неверный день недели";
        }
        return description;
    }

    public static String convertScore() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int num = scanner.nextInt();

        String result = "";

        if (num < 0 || num > 100) {
            System.out.println("Некорректное число");

        } else {
            int group = num / 10;
            switch (group) {
                case 10, 9 -> result = "A";
                case 8 -> result = "B";
                case 7 -> result = "C";
                case 6 -> result = "D";
                default -> result = "F";
            }
        }
        return result;
    }

    public static String handleCommand() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        String result;

        switch (command) {
            case "start" -> result = "Система запущена";
            case "stop" -> result = "Система остановлена";
            case "restart" -> result = "Система перезапущена";
            case "status" -> result = "Статус системы";
            default -> result = "Введена неверная команда";
        }
        return result;
    }

    public static double calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextInt();

        System.out.print("Введите оператор: ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextInt();

        double result = 0;

        if(b == 0 && operator.equals("/")){
            System.out.println("Ошибка при деление на 0");

        }else {
            switch (operator) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                default -> System.out.println("Введен некорректный оператор");
            }
        }
        return result;
    }

}