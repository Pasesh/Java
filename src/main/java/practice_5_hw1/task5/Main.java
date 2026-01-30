package practice_5_hw1.task5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        FarmAnimal chicken = new Chicken();
        FarmAnimal cow = new Cow();

        farm.setFarm(chicken);
        farm.serviceAnimal();

        farm.setFarm(null);
        farm.serviceAnimal();

        farm.setFarm(cow);
        farm.serviceAnimal();
    }
}
