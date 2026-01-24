package practice_4_hw1;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {

        //Вычисление факториала с помощью while
        System.out.println(calculateFactorial());

        //Вывод всех чётных чисел до заданного
        printEvenNumbers();

        //Обратный отсчёт от введённого числа до 1
        printCountdownFrom();

    }

    public static int calculateFactorial() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");

        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не существует");
        } else {
            while (i <= n) {
                result = result * i;
                i++;
            }
        }
        return result;
    }
    public static void printEvenNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int n = scanner.nextInt();
        int i = 1;

        while (i <= n){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void printCountdownFrom(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");

        int n = scanner.nextInt();
        while (n >= 1){
            System.out.println(n);
            n--;
        }
    }
}
