package practice_5_hw1.task7;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        Attraction carousel = new Carousel();
        Attraction rollerCoaster = new RollerCoaster();

        park.setAttraction(carousel);
        park.operateAttraction();

        park.setAttraction(rollerCoaster);
        park.operateAttraction();

        park.setAttraction(null);
        park.operateAttraction();

    }
}
