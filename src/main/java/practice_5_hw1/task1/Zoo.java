package practice_5_hw1.task1;

public class Zoo {
    private Animal animal;

    void setAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное добавлено");
    }

    void showAnimal(){
        if(animal == null){
            System.out.println("В зоопарке еще нет животного");
            return;
        }
        animal.makeSound();
        animal.move();
    }
}
