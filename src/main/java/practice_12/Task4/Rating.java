package practice_12.Task4;

public class Rating <T extends Number>{
    private T value;

    public Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
