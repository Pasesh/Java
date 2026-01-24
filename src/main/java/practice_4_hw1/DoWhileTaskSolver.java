package practice_4_hw1;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        //Запрос положительного числа
        getPositiveNumber();

        //Проверка пароля
        checkPassword();

        //Вывод чисел от 1 до 10 с использованием do-while
        printNumbersFromOnneToTen();

        //Завершение программы по команде "exit"
        exitProgram();

        //Подсчёт количества цифр в числе
        System.out.println(getDigitalCount());


    }

    public static void getPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Программа завершена");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        }
        while (!password.equals("123Test"));
        System.out.println("Пароль верный");
    }

    public static void printNumbersFromOnneToTen() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();

        } while (!command.equals("exit"));
        System.out.println("Программа завершена");
    }

    public static int getDigitalCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            do {
                num = num / 10;
                count++;
            }
            while (num != 0);
        }
        return count;
    }

}
