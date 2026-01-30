package practice_5_hw1.task8;

public class Manuscript extends Exhibit{
    @Override
    void describe() {
        System.out.println("Древний текст");
    }

    @Override
    void preserve() {
        System.out.println("Манускрипт — требует контролируемой влажности");
    }
}
