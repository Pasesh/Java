package practice_5_hw1.task2;

public class Cat extends Pet {

    @Override
    public void feed(){
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    void interact() {
        System.out.println("Кошка играет");
    }
}
