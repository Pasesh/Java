package practice_10_hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends MethodsTest {

    public static Stream<Arguments> stringsForCountingVowels() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("qwrt", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("stringsForCountingVowels")
    void shouldReturnCorrectVowelsCount(String inputString, int expectedResult) {

        int actualResult = methods.countVowels(inputString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenStringIsNUll() {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.countVowels(null);
        }, "IllegalArgumentException expected when string is null");
    }

}
