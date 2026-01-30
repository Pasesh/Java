package practice_5_hw1.task1;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        zoo.setAnimal(bird);
        zoo.showAnimal();

        zoo.setAnimal(elephant);
        zoo.showAnimal();

        zoo.setAnimal(null);
        zoo.showAnimal();
    }
}
