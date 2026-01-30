package practice_5_hw1.task7;

public class RollerCoaster extends Attraction{
    @Override
    void info() {
        System.out.println("Острые ощущения");
    }

    @Override
    void maintain() {
        System.out.println("Проверка безопасности");
    }
}
