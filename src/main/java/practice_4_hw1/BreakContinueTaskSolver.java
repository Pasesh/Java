package practice_4_hw1;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Сумма чисел до первого отрицательного (использовать break)
        System.out.println(sumUntilNegative(scanner));

        //Пропуск чисел, делящихся на 3 (использовать continue)
        skipNumbers();

        //Вывод только положительных чисел (использовать continue)
        printPositiveNumbers(scanner);

        //Ввод строк до команды "stop" (использовать break)
        isStopCommand(scanner);

    }

    public static int sumUntilNegative(Scanner scanner){

        int sum = 0;

        while (true){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (num < 0){
                break;
            }
            sum = sum + num;
        }
        return sum;
    }

    public static void skipNumbers(){

        for (int i = 0; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printPositiveNumbers(Scanner scanner){
        do {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if(num < 0){
                continue;
            }
            if(num == 0){
                break;
            }
            System.out.println(num);
        } while (true);
    }

    public static void isStopCommand(Scanner scanner){
        scanner.nextLine();
        while (true){
            System.out.print("Введите строку: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                System.out.println("Программа остановлена");
                break;
            }
        }
    }
}
