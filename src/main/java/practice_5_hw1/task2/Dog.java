package practice_5_hw1.task2;

public class Dog extends Pet implements Walkable{

    @Override
    void feed() {
        System.out.println("Собака ест сухой корм");
    }


    @Override
    public void walk() {
        System.out.println("Собака гуляет");
    }
}
