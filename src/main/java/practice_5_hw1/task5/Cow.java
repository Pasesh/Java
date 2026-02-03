package practice_5_hw1.task5;

public class Cow extends FarmAnimal {

    @Override
    void produce(){
        System.out.println("Корова даёт молоко");
    }

    @Override
    void feed() {
        System.out.println("Корова ест траву");
    }

    public void care(){
        System.out.println("Корова нуждается в выпасе");
    }
}
