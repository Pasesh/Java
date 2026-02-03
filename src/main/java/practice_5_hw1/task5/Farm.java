package practice_5_hw1.task5;

public class Farm {
    private FarmAnimal farmAnimal;

    void setFarm(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
        System.out.println("Домашнее животное создано");
    }

    void serviceAnimal(){
        if (this.farmAnimal == null){
            System.out.println("На ферме еще нет домашних животных");
            return;
        }
        farmAnimal.produce();
        farmAnimal.feed();
        farmAnimal.care();
    }
}
