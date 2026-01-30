package practice_5_hw1.task3;

public class Drink extends Dish{
    private int volume;

    Drink(int volume){
        this.volume = volume;
    }

    int getVolume(){
        return this.volume;
    }

    @Override
    String getDescription() {
        return "Объем напитка: " + this.volume + " мл";
    }
}
