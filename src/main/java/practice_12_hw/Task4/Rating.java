package practice_12_hw.Task4;

public class Rating <T extends Number>{
    private T rating;

    public T getRating() {
        return rating;
    }

    public Rating(T rating) {
        this.rating = rating;
    }
}
