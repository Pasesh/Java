package practice_9_hw;

public class Counter {
    private int counter = 0;

    public synchronized void increment(){
        this.counter++;
    }

    public synchronized int getCounter(){
        return this.counter;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () ->{
          for (int i = 0; i < 1000; i++){
              counter.increment();
          }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Значение счетчика: " + counter.getCounter());
    }
}
