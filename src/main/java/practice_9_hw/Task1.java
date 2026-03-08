package practice_9_hw;

public class Task1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
           for (int i = 0; i < 5; i++){
               System.out.println("Привет из потока!");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   System.out.println("Поток остановлен");
               }
           }
        });
        thread.start();
    }
}
