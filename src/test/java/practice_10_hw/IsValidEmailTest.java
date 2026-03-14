package practice_10_hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends MethodsTest{


    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    void shouldReturnTrueForValidEmail(String inputString){
        assertTrue(methods.isValidEmail(inputString));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain", ""})
    void shouldReturnFalseForInvalidEmail(String inputString){
        assertFalse(methods.isValidEmail(inputString));
    }


    @Test
    void shouldReturnFalseEmailIsNull(){
        assertFalse(methods.isValidEmail(null));
    }
}
