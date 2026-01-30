package practice_5_hw1.task5;

public class Cow extends FarmAnimal implements Careable{

    @Override
    void produce(){
        System.out.println("Корова даёт молоко");
    }

    public void care(){
        System.out.println("Корова нуждается в выпасе");
    }
}
