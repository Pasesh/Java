package practice_5_hw1.task6;

public class Garden {
    private Plant plant;

    void setPlant(Plant plant){
        this.plant = plant;
        System.out.println("Растение добавлено");
    }

    void maintainPlant(){
        if(this.plant == null){
            System.out.println("В саду еще нет растений");
            return;
        }
        plant.care();
    }
}
