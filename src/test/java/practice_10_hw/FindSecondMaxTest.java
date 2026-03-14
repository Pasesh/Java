package practice_10_hw;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FindSecondMaxTest extends MethodsTest{

    public static Stream<Arguments> validArrays(){
        return Stream.of
                (Arguments.of(new int[]{3, 5, 7, 2},5),
                Arguments.of(new int[]{-3, -5, 0, 1},0));

    }

    @ParameterizedTest
    @MethodSource("validArrays")
    void shouldReturnSecondMaxFromArray(int[] inputArray, int expectedResult){

        int actualResult = methods.findSecondMax(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenArrayWithNumberEquals(){
        assertThrows(NoSuchElementException.class, () ->{
            methods.findSecondMax(new int[]{4, 4, 4});
        }, "Array withNumber equals NoSuchElementException");
    }

    @Test
    @Tag("Bug findSecondMax method")
    void shouldThrowNoSuchElementExceptionWhenArrayWithOneNumbers(){
        assertThrows(NoSuchElementException.class, () ->{
            methods.findSecondMax(new int[]{4});
        }, "Array withNumber equals NoSuchElementException");
    }
}
