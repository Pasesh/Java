package practice_5_hw1.task7;

public class Park {
    private Attraction attraction;

    void setAttraction(Attraction attraction){
        this.attraction = attraction;
        System.out.println("Аттракцион добавлен");
    }

    void operateAttraction(){
        if (this.attraction == null){
            System.out.println("В парке еще нет аттракционов");
            return;
        }
        attraction.info();
        attraction.maintain();
    }
}
