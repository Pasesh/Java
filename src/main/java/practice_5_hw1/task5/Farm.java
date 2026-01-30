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
        if(this.farmAnimal instanceof Feedable){
            Feedable feedableAnimal = (Feedable) this.farmAnimal;
            feedableAnimal.feed();
        }
        if (this.farmAnimal instanceof Careable){
            Careable careableAnimal = (Careable) this.farmAnimal;
            careableAnimal.care();
        }
    }
}
