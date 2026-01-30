package practice_5_hw1.task8;

public class Sculpture extends Exhibit{

    @Override
    void describe(){
        System.out.println("Скульптурный объект");
    }

    @Override
    void preserve() {
        System.out.println("Скульптура — нуждается в реставрации");
    }


}
