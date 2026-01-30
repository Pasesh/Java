package practice_5_hw1.task3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish soup = new HotDish(80);
        Dish vodka = new Drink(50);

        menu.setDish(soup);
        menu.printMenu();

        menu.setDish(vodka);
        menu.printMenu();

        menu.setDish(null);
        menu.printMenu();
    }
}
