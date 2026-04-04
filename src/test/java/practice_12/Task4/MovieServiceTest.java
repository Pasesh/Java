package practice_12.Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    private MovieService service;
    private Movie avatar;
    private Movie titanic;

    @BeforeEach
    public void setUp(){
        service = new MovieService();
        avatar = new Movie("Avatar");
        titanic = new Movie("Titanic");
    }

    @Test
    void shouldAddRatingToMovie(){
        service.addRating(avatar, new Rating<>(8));
        double actualResult = service.averageRate(avatar);
        assertEquals(8.0,actualResult);

    }

    @Test
    void shouldReturnAverageRating(){
        service.addRating(avatar, new Rating<>(8));
        service.addRating(avatar, new Rating<>(9));
        service.addRating(avatar, new Rating<>(10));
        double actualResult = service.averageRate(avatar);
        assertEquals(9.0,actualResult);
    }

    @Test
    void shouldReturnZeroWhenNoRatings(){
        double actualResult = service.averageRate(avatar);
        assertEquals(0.0,actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 11})
    void shouldExceptionWhenInvalidRatings(int invalidRatings){

        assertThrows(IllegalArgumentException.class, () ->{
            service.addRating(titanic, new Rating<>(invalidRatings));
        });
    }

    @Test
    void shouldThrowExceptionWhenMovieIsNull(){
        assertThrows(IllegalArgumentException.class, () ->{
            service.addRating(null, new Rating<>(8));
        });
    }

    @Test
    void shouldSortMoviesByRating(){
        service.addRating(avatar, new Rating<>(9.6));
        service.addRating(titanic, new Rating<>(9.7));
        service.addRating(new Movie("No name"), new Rating<>(5));

        List<Movie> actualResult = service.sortMoviesByRating();
        List<Movie> expected = List.of(
                titanic, avatar, new Movie("No name")
        );
        assertEquals(expected, actualResult);
    }


}
