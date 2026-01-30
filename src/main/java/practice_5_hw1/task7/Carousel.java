package practice_5_hw1.task7;

public class Carousel extends Attraction{

    @Override
    void info(){
        System.out.println("Спокойный аттракцион");
    }

    @Override
    void maintain(){
        System.out.println("Техническое обслуживание");
    }
}
