package practice_5_hw1.task5;

public class Chicken extends FarmAnimal implements Feedable{
    @Override
    void produce() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void feed() {
        System.out.println("Курица требует зерно");
    }
}
