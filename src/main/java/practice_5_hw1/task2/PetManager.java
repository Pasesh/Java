package practice_5_hw1.task2;

public class PetManager {
    private Pet pet;

    void setPet(Pet pet){
        this.pet = pet;
        System.out.println("Животное добавлено");
    }

    void handlePet(){
        if(pet == null){
            System.out.println("Домашнего питомца еще нет");
            return;
        }
        pet.feed();
        pet.interact();
    }
}
