package practice_12.Task4;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovieService {
    //Rating<? extends Number> любой рейтинг, который хранит число
    // T → конкретный один тип, который ты заранее фиксируешь
    //? extends Number → любой подходящий тип, можно смешивать

    private final Map<Movie, List<Rating<? extends Number>>> ratings = new ConcurrentHashMap<>();//для каждого фильма храним список его оценок
    //ключ = фильм - Movie -> [Rating, Rating, Rating]
    //значение = список оценок этого фильма


    public void addRating(Movie movie, Rating<? extends Number> rating){

        if (movie == null){
            throw new IllegalArgumentException("Movie cannot be null");
        }

        if (rating == null){
            throw new IllegalArgumentException("Rating cannot be null");
        }

        double rate = rating.getValue().doubleValue();//приводим к общему числовому виду

        if(rate < 1 || rate > 10){
            throw new IllegalArgumentException("Rating must be between 1 and 10");
        }
        ratings.computeIfAbsent(movie, k -> new CopyOnWriteArrayList<>()).add(rating);//возвращает значение
        /*
        если у фильма уже есть список → взять его
        если нет → создать новый ArrayList
        потом добавить туда rating

        computeIfAbsent(key, function)
        если ключа нет — вычисли значение и положи,
        если есть — просто верни существующее

        List<Rating<? extends Number>> list = ratings.get(movie);

            if (list == null) {
            list = new ArrayList<>();
            ratings.put(movie, list);
                }

            list.add(rating);
         */
    }

    public double averageRate(Movie movie){
        if (movie == null){
            throw new IllegalArgumentException("Movie cannot be null");
        }
        List<Rating<? extends Number>> list = ratings.get(movie);//достань из Map список оценок для этого фильма
        if (list == null|| list.isEmpty()){
            return 0.0;
        }
        return list.stream()
                .mapToDouble(r -> r.getValue().doubleValue())//преобразовываем рейтинги в значения [Rating(8), Rating(9.5), Rating(7)] -> [8.0, 9.5, 7.0]
                .average()//работает с числовыми стримами DoubleStream, а не потоками объектов Stream<Integer>
                .orElse(0.0);
    }

    public List<Movie> sortMoviesByRating(){
        return ratings.keySet().stream()//берём все фильмы
                .sorted(Comparator.comparingDouble(this::averageRate).reversed())//сортируем их по средней оценке от большей к меньшей
                //this::getAverageRating ссылка на метод для каждого фильма вызови метод getAverageRating(movie)
                //movie -> this.averageRate(movie)
                .toList();
    }

    public void printMoviesWithRatings() {
        ratings.keySet().stream()
                .sorted(Comparator.comparingDouble(this::averageRate).reversed())
                .forEach(movie -> {
                    double avg = averageRate(movie);
                    System.out.println(movie.getTitle() + " → ⭐ " + avg);
                });
    }
}
