package practice_8_hw.part1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        MathOperation sum = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Деление на 0 запрещено");
            }
            return x / y;
        };

        System.out.println(sum.operate(4.5, 5.4));
        System.out.println(subtract.operate(10.1, 5.1));
        System.out.println(multiply.operate(15.4, 5.2));
        try {
            System.out.println(divide.operate(15, 0));
            } catch (ArithmeticException e) {
        }
        System.out.println();

        System.out.println("Task 2");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();
        System.out.println();


        System.out.println("Task 3");
        Predicate<Integer> isEven = x -> x % 2 ==0;
        int number = 7;
        System.out.println("Число " + number + (isEven.test(number)? " четное" : " нечетное"));
        System.out.println();

        System.out.println("Task 4");
        Function<String, Integer> result = String::length;
        System.out.println(result.apply("Привет, мир!"));
        System.out.println();

        System.out.println("Task 5");
        Consumer<String> resultPrint = System.out::println;
        resultPrint.accept("Печать результата");
    }
}
