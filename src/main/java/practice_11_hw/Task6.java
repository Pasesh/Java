package practice_11_hw;

public class Task6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        if(n <= 0){
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
}
