package practice_5_hw1.task2;

public class Dog extends Pet {

    @Override
    void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    void interact() {
        System.out.println("Собака гуляет");
    }
}
