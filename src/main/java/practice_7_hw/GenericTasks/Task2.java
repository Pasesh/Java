package practice_7_hw.GenericTasks;

public class Task2 {
    public static <T>void printArray(T[] array){
        for (T elent : array){
            System.out.println(elent);
        }
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 3};
        printArray(arrayInt);
        System.out.println();

        String[] arrayStr = {"a", "b", "c"};
        printArray(arrayStr);
     }
}
