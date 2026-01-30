package practice_5_hw1.task3;

public class Menu {
    private Dish dish;

    void setDish(Dish dish){
        this.dish = dish;
        System.out.println("Блюдо добавлено");
    }

    void printMenu(){
        if (this.dish == null){
            System.out.println("В меню пока нет блюда");
            return;
        }
        System.out.println(dish.getDescription());
    }
}
