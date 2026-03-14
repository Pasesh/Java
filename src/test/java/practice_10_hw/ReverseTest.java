package practice_10_hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseTest extends MethodsTest{

    public static Stream<Arguments> stringsToReverse(){
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("123", "321")
        );
    }

    @ParameterizedTest
    @MethodSource("stringsToReverse")
    void shouldReverseStringCorrectly(String inputString, String expectedResult){

        String actualResult = methods.reverse(inputString);
        assertEquals(expectedResult,actualResult, "Reversed string does not match expected value");
    }

    @Test
    void shouldReturnNullWhenStringIsNull(){
        assertNull(methods.reverse(null));
    }
}
