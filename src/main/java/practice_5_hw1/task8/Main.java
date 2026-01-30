package practice_5_hw1.task8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.setExhibit(manuscript);
        museum.showExhibit();

     museum.setExhibit(sculpture);
        museum.showExhibit();

        museum.setExhibit(null);
        museum.showExhibit();

    }
}
