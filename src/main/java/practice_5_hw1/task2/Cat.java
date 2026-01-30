package practice_5_hw1.task2;

public class Cat extends Pet implements Playable{

    @Override
    public void feed(){
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void play(){
        System.out.println("Кошка играет");
    }
}
