package practice_5_hw1.task4;

public class Aquarium {
    private SeaCreature seaCreature;

    void setSeaCreature(SeaCreature seaCreature){
        this.seaCreature = seaCreature;
        System.out.println("Морское существо добавлено");
    }

    void showMovement(){
        if(seaCreature == null){
            System.out.println("В аквариуме еще нет морских существ");
            return;
        }
        seaCreature.move();
    }
}
