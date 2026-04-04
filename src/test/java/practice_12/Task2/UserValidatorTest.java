package practice_12.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    private UserValidator validator;
    private User validUser;
    private User invalidUser;

    @BeforeEach
    void setUp() {
        validator = new UserValidator(true);
        validUser = new User("Anna", 20, "test@gmail.com");
        invalidUser = new User("anna", 10, "bad-email");
    }

    static Stream<String> invalidNames() {
        return Stream.of(
                null, "", "   ", "anna");
    }

    static Stream<String> validNames() {
        return Stream.of("Anna", "Maria", "Elena");
    }

    static Stream<Integer> invalidAges() {
        return Stream.of(17, 101);
    }

    static Stream<Integer> validAges() {
        return Stream.of(18, 100);
    }

    static Stream<String> invalidEmails() {
        return Stream.of(
                null,
                "",
                "  ",
                "testgmail.com",
                "@mail.ru",
                "test@",
                "test@gmail",
                "test@.com",
                "test@@gmail.com"
        );
    }

    static Stream<String> validEmails() {
        return Stream.of(
                "test@gmail.com",
                "user.name@mail.ru"
        );
    }


    @Test
    public void shouldNotThrowWhenUserIsValid() {
        assertDoesNotThrow(() -> validator.validate(validUser));
    }

    @Test
    public void shouldThrowWhenUserIsInvalid() {
        assertThrows(InvalidUserException.class, () -> validator.validate(invalidUser));
    }

    @Test
    public void shouldNotValidateWhenValidationDisabled() {
        UserValidator validatorOff = new UserValidator(false);
        assertDoesNotThrow(() -> validatorOff.validate(invalidUser));
    }


    @ParameterizedTest
    @MethodSource("invalidNames")
    public void shouldThrowWhenNameIsInvalid(String name) {
        User user = new User(name, 20, "test@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("validNames")
    public void shouldNotThrowWhenNameIsValid(String name) {
        User user = new User(name, 20, "test@gmail.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("invalidAges")
    public void shouldThrowWhenAgeIsInvalid(int age) {
        User user = new User("Anna", age, "test@gmail.com");
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("validAges")
    public void shouldNotThrowWhenAgeIsValid(int age) {
        User user = new User("Anna", age, "test@gmail.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("invalidEmails")
    public void shouldThrowWhenEmailIsInvalid(String email) {
        User user = new User("Anna", 20, email);
        assertThrows(InvalidUserException.class, () -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("validEmails")
    public void shouldNotThrowWhenEmailIsValid(String email) {
        User user = new User("Anna", 20, email);
        assertDoesNotThrow(() -> validator.validate(user));
    }


}
