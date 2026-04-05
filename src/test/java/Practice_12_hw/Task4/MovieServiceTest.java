package Practice_12_hw.Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import practice_12_hw.Task4.Movie;
import practice_12_hw.Task4.MovieService;
import practice_12_hw.Task4.Rating;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    private MovieService service;
    private Movie movie1;
    private Movie movie2;

    @BeforeEach
    public void setUp(){
        service = new MovieService();
        movie1 = new Movie("Avatar");
        movie2 = new Movie("Titanic");
    }

    @Test
    public void shouldAddRatingToMovie(){
        service.addRating(movie1, new Rating<>(8.1));
        double  result = service.averageRate(movie1);
        assertEquals(8.1 , result);
    }
    @Test
    public void shouldReturnAverageRating() {
        service.addRating(movie1, new Rating<>(8.5));
        service.addRating(movie1, new Rating<>(9.5));
        service.addRating(movie1, new Rating<>(9.0));

        double result = service.averageRate(movie1);

        assertEquals(9.0, result);
    }

    @Test
    public void shouldReturnZeroWhenNoRating(){
        double result = service.averageRate(movie1);
        assertEquals(0.0, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 0 , 11})
    public void shouldThrowExceptionWhenInvalidRatings(int invalidRatings){
        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(movie1, new Rating<>(invalidRatings));
        });
    }
    @Test
    public void shouldThrowExceptionWhenMovieIsNull(){
        assertThrows(IllegalArgumentException.class, () -> {
            service.addRating(null, new Rating<>(8));
        });
    }

    @Test
    public void shouldSortMoviesByRatings(){
        service.addRating(movie1, new Rating<>(9.6));
        service.addRating(movie2, new Rating<>(9.8));
        service.addRating(new Movie("No name"), new Rating<>(5));

        List<Movie> result = service.sortMoviesByRating();
        List<Movie> expectedResult = List.of(
                movie2, movie1, new Movie("No name")
        );

        assertEquals(expectedResult, result);
    }
}
