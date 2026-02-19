package practice_7_hw.GenericTasks;

public class Pair<T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair <String, Integer> pair = new Pair<>();

        pair.setFirst("Ann");
        pair.setSecond(20);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
