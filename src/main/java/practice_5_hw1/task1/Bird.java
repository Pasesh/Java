package practice_5_hw1.task1;

public class Bird extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Птица чирикает");
    }

    @Override
    public void move(){
        System.out.println("Птица летает");
    }
}
