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

        if(this.pet instanceof Playable){
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        }
        if (this.pet instanceof Walkable){
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        }
        else System.out.println("Ошибка");

    }
}
