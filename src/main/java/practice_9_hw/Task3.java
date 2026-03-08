package practice_9_hw;

public class Task3 {
    private volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
           long counter = 0;
           while (!stop){
               counter++;
           }
            System.out.println("Значение счетчика: " + counter);
        });

        thread.start();
        Thread.sleep(2000);
        stop = true;
        thread.join();
        System.out.println("Поток завершен");
    }
}
