package practice_5_hw1.task4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();

        aquarium.setSeaCreature(shark);
        aquarium.showMovement();

        aquarium.setSeaCreature(starfish);
        aquarium.showMovement();

        aquarium.setSeaCreature(null);
        aquarium.showMovement();
    }
}
