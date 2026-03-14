package practice_10_hw;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest extends MethodsTest {


    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    void shouldReturnTrueWhenPhoneNumberIsValid(String inputPhoneNumber) {
        assertTrue(methods.isValidPhoneNumber(inputPhoneNumber));
    }

    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghi", "+1234 1234567890", "+1 123", ""})
    void shouldReturnFalseWhenPhoneNumberIsInvalid(String inputPhoneNumber) {
        assertFalse(methods.isValidPhoneNumber(inputPhoneNumber));
    }

    @Test
    @Tag("Bug isValidPhoneNumber method")
    void shouldThrowIllegalArgumentExceptionWhenPhoneNumberIsNull() {
        assertThrows(IllegalArgumentException.class, () ->{
            methods.isValidPhoneNumber(null);
        },"IllegalArgumentException expected when phoneNumber is null");
    }
}
