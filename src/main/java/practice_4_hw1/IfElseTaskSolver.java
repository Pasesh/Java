package practice_4_hw1;

import java.util.Scanner;

public class IfElseTaskSolver {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Определение знака числа
        System.out.println(getNumber());

        //Поиск наибольшего из двух чисел
        System.out.println(findMaxOfTwo());

        //Вывод оценки по шкале 1–5
        System.out.println(printGradeResult());

        //Проверка на чётность
        System.out.println(isEven());

        //Определение размера скидки по возрасту
        System.out.println(getDiscountByAge());

        //Оценка результата теста по баллам
        System.out.println(printTestResult());





    }

    public static String getNumber(){

        System.out.print("Введите число: ");

        int number = scanner.nextInt();
        String description;

        if (number > 0){
            description = "Число положительное";
        }
        else if (number < 0){
            description = "Число отрицательное";
        }
        else {
            description = "Число равно нулю";
        }
        return description;
    }

    public static int findMaxOfTwo(){


        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int max = 0;

        if (a < b){
            max = b;
        }
        else if (a > b) {
            max = a;
        }else {
            System.out.println("Числа равны");
            return a;
        }
        return max;
    }

    public static String printGradeResult(){

        System.out.print("Введите число от 1 до 5: ");
        int number = scanner.nextInt();

        String result;

        if(number == 5){
            result = "Отлично";
        }
        else if(number == 4){
            result = "Хорошо";
        }
        else if(number == 3) {
            result = "Удовлетворительно";
        }
        else if (number == 2 || number == 1) {
            result = "Неудовлетворительно";
        }
        else {
            result = "Некорректное число";
        }
        return result;
    }

    public static String isEven(){


        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        return (number % 2 == 0)?"Четное":"Нечетное";
    }

    public static String getDiscountByAge(){

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        String result;

        if(age < 0){
            result = "Введен некорректный возраст";
        }
        else if(age < 18){
            result = "25%";
        }
        else if(age >= 65){
            result = "30%";
        }
        else {
            result = "без скидки";
        }
    return result;
    }

    public static String printTestResult() {

        System.out.print("Введите ваш результат теста от 0 до 100: ");
        int number = scanner.nextInt();
        String result = "";

        if (number > 100 || number < 0) {
            result = "Введен некорректный результат теста";
        } else if (number >= 90) {
            result = "Отлично";
        } else if (number >= 75) {
            result = "Хорошо";
        } else if (number >= 60) {
            result = "Удовлетворительно";
        } else {
            result = "Неудовлетворительно";
        }
        return result;
    }
}
