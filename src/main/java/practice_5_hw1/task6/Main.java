package practice_5_hw1.task6;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        garden.setPlant(orchid);
        garden.maintainPlant();

        garden.setPlant(cactus);
        garden.maintainPlant();

        garden.setPlant(null);
        garden.maintainPlant();

    }
}
