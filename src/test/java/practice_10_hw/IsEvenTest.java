package practice_10_hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends MethodsTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 4, -8})
    void shouldReturnTrueWhenNumberIsEven(int inputNumbers){
        assertTrue(methods.isEven(inputNumbers));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, -9})
    void shouldReturnFalseWhenNumberIsOdd(int inputNumbers){
        assertFalse(methods.isEven(inputNumbers));
    }

}
