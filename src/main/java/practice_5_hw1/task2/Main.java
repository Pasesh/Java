package practice_5_hw1.task2;

public class Main {
    public static void main(String[] args) {

        PetManager pm = new PetManager();
        Pet cat = new Cat();
        Pet dog = new Dog();

        pm.setPet(cat);
        pm.handlePet();

        pm.setPet(dog);
        pm.handlePet();

        pm.setPet(null);
        pm.handlePet();
    }
}
