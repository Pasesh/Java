package practice_5_hw1.task3;

public class HotDish extends Dish{
    private int temperature;

    HotDish(int temperature){
        this.temperature = temperature;
    }

    int getTemperature(){
        return this.temperature;
    }

    @Override
    String getDescription(){
        return "Температура горячего блюда: " + this.temperature +"°";
    }
}
