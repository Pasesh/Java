package practice_7_hw.GenericTasks;

public class Storage<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Storage<String> storageStr = new Storage<>();
        storageStr.setItem("a");
        System.out.println(storageStr.getItem());

        Storage<Integer> storageInt = new Storage<>();
        storageInt.setItem(1);
        System.out.println(storageInt.getItem());
    }
}
