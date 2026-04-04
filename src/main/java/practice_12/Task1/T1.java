package practice_12.Task1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/*

Контекст: В системе есть множество ID активных пользователей (HashSet). Нужно отправить уведомление каждому пользователю,
но при этом пропустить (не выводить) пользователей, находящихся в "черном списке". Черный список задан отдельной коллекцией Set



Условие: Использовать Set и метод forEach. Запрещено использовать stream(). Нужно реализовать логику пропуска внутри лямбд
Исходные данные:

Set<Integer> activeUsers = new HashSet<>(Arrays.asList(101, 202, 303, 404, 505));
Set<Integer> blacklist = new HashSet<>(Arrays.asList(202, 404));
Требование:
"Отправить уведомление" (вывести в консоль сообщение "Sending notification to user: X") только тем пользователям из activeUsers,
чьи ID отсутствуют в blacklist
 */
public class T1 {
    public static void main(String[] args) {


        List<Double> prices = new ArrayList<>(Arrays.asList(500.0, 1200.0, 300.0, 1500.0, 800.0));
        AtomicReference<Double> sum = new AtomicReference<>(0.0);//Потому что внутри лямбды в forEach Java не даёт просто так менять обычную локальную переменную.

// сначала меняем список
        prices.replaceAll(price -> {
            if (price > 1000) {
                return price * 0.9;
            }
            return price;
        });

// потом считаем сумму
        prices.forEach(price ->{
            sum.set(sum.get() + price);
                }
        );

        System.out.println("Итоговая сумма: " + sum.get());
        System.out.println("Изменённый список: " + prices);
    }


}