package practice_10_hw;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends MethodsTest {

    public static Stream<Arguments> validStrings() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome", 3),
                Arguments.of(" Java  is  awesome", 3),
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("validStrings")
    @Tag("Bug countWords methods")
    void shouldReturnCorrectWordCount(String inputString, int expectedResult) {

        int actualResult = methods.countWords(inputString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Tag("Bug countWords methods")
    void shouldTrowIllegalArgumentExceptionWhenStringIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            methods.countWords(null);
        }, "IllegalArgumentException expected when string is null");
    }
}
