package practice_12_hw.Task4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MovieService {

    private  final Map<Movie, List<Rating <? extends Number>>> ratings = new ConcurrentHashMap<>();

    public void addRating(Movie movie, Rating <? extends Number> rating){

        if(movie == null){
            throw new IllegalArgumentException("Фильм не может быть пустым");
        }
        if(rating == null){
            throw new IllegalArgumentException("Рейтинг не может быть пустым");
        }
        double rate = rating.getRating().doubleValue();
        if (rate < 1 || rate > 10){
            throw new IllegalArgumentException("Рейтинг должен быть в диапазоне от 1 до 10");
        }
        ratings.computeIfAbsent(movie, k -> new CopyOnWriteArrayList<>()).add(rating);
    }

    public double averageRate(Movie movie) {
        if (movie == null) {
            throw new IllegalArgumentException("Фильм не может быть пустым");
        }
        List<Rating<? extends Number>> list = ratings.get(movie);
        if (list == null|| list.isEmpty()){
            return 0.0;
        }
        return list.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);
     }

    public List<Movie> sortMoviesByRating(){
        return ratings.keySet().stream()
                .sorted(Comparator.comparingDouble(this::averageRate).reversed())
                .toList();
    }
}
