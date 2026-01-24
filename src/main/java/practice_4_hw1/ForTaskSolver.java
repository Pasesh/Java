package practice_4_hw1;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {

        //Вывод чисел от 1 до 100, делящихся на 3
        printNumberDividedByThree();

        //Сумма чисел от 1 до n
        System.out.println(calculateSum());

        //Таблица умножения для числа
        printMultiplicationTable();

        //Проверка на простое число
        System.out.println(checkPrime());

        //Вывод чисел от 1 до 10
        PrintNumbers();


    }

    public static void printNumberDividedByThree() {
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0) {
                System.out.println(i);
            }
    }

    public static int calculateSum() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int n = scanner.nextInt();

        int sum = 0;

        if (n < 0) {
            System.out.println("Некорректное число");
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void printMultiplicationTable() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static String checkPrime() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное число: ");
        int n = scanner.nextInt();

        String description = "Простое число";

        if (n == 1) {
            description = "Не является простым числом";
        } else {

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    description = "Не является простым числом";
                }
            }
        }
        return description;
    }

    public static void PrintNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
