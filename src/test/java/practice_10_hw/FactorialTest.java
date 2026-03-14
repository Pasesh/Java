package practice_10_hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MethodsTest{

    public static Stream<Arguments> validFactorialNumbers(){
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("validFactorialNumbers")
    void shouldCalculateFactorial(int inputNumber, int expectedResult){

        int actualResult = methods.factorial(inputNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForNegativeNumbers(){

        assertThrows(IllegalArgumentException.class, () ->{
            methods.factorial(-5);
        }, "IllegalArgumentException expected when number is negative");
    }
}
