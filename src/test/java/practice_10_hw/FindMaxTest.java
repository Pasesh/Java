package practice_10_hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends MethodsTest {


    public static Stream<Arguments> validArraysForFindMax(){
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysForFindMax")
    void shouldReturnMaxNumbersFromArray(int[] inputArray, int expectedResult){

        int actualResult = methods.findMax(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowNoSuchElementExceptionWhenArrayIsEmpty(){
        assertThrows(NoSuchElementException.class, () ->{
            methods.findMax(new int[]{});
        },"NoSuchElementException expected when array is null");
    }

}
