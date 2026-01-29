package practice_4_hw1;

import java.util.Scanner;

public class DoWhileTaskSolver {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Запрос положительного числа
        getPositiveNumber();

        //Проверка пароля
        checkPassword();

        //Вывод чисел от 1 до 10 с использованием do-while
        printNumbersFromOneToTen();

        //Завершение программы по команде "exit"
        exitProgram();

        //Подсчёт количества цифр в числе
        System.out.println(getDigitalCount());


    }

    public static void getPositiveNumber() {


        int num;
        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Программа завершена");
    }

    public static void checkPassword() {

        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        }
        while (!password.equals("123Test"));
        System.out.println("Пароль верный");
    }

    public static void printNumbersFromOneToTen() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitProgram() {

        String command;

        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();

        } while (!command.equals("exit"));
        System.out.println("Программа завершена");
    }

    public static int getDigitalCount() {

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
