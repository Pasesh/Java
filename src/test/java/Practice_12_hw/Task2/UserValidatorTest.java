package Practice_12_hw.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import practice_12_hw.Task2.InvalidUserException;
import practice_12_hw.Task2.User;
import practice_12_hw.Task2.UserValidator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {

    private UserValidator validator;
    private User validUser;
    private User invalidUser;

    @BeforeEach
    public void setUp(){
        validator = new UserValidator(true);
        validUser = new User("Anna", 20, "test@mail.ru");
        invalidUser = new User("anna", 10, "bad-email");
    }

    static Stream<String> invalidNames(){
        return Stream.of(null, "", "  ", "anna");
    }

    static Stream<String> validNames(){
        return Stream.of("Anna", "Elena", "Ekaterina");
    }

    static Stream<Integer> invalidAges(){
        return Stream.of(17, 101);
    }

    static Stream<Integer> validAges(){
        return Stream.of(18, 100);
    }

    static Stream<String> invalidEmails(){
        return Stream.of(
                null,
                "",
                "  ",
                "test.mail.ru",
                "@gmail.com",
                "user@",
                "test@mail",
                "user@mail.c",
                "test@domain@mail.com",
                "test#email@domain.com"
        );
    }

    static Stream<String> validEmails(){
        return Stream.of(
                "test@mail.ru",
                "user.name@gamil.com"
        );
    }

    @Test
    public void shouldNotThrowWhenUserIsValid(){
        assertDoesNotThrow(() -> validator.validate(validUser));
    }

    @Test
    public void shouldThrowWhenUserIsInvalid(){
        assertThrows(InvalidUserException.class,() -> validator.validate(invalidUser));
    }

    @Test
    public void shouldNotValidateWhenValidationDisabled(){
        validator = new UserValidator(false);
        assertDoesNotThrow(() -> validator.validate(invalidUser));
    }

    @ParameterizedTest
    @MethodSource("invalidNames")
    public void shouldThrowWhenNameIsInvalid(String name){
        User user = new User(name, 20, "test@mail.ru");
        assertThrows(InvalidUserException.class, () ->{
            validator.validate(user);
        });
    }

    @ParameterizedTest
    @MethodSource("validNames")
    public void shouldNotThrowWhenNameIsValid(String name){
        User user = new User(name, 20, "test@mail.ru");

        assertDoesNotThrow(() -> validator.validate(user));
    }


    @ParameterizedTest
    @MethodSource("invalidAges")
    public void shouldThrowWhenAgeIsInvalid(int age){
        User user = new User("Anna", age, "test@mail.ru");
        assertThrows(InvalidUserException.class, () ->{
            validator.validate(user);
        });
    }

    @ParameterizedTest
    @MethodSource("validAges")
    public void shouldNotThrowWhenAgeIsValid(int age){
        User user = new User("Anna", age, "test@mail.ru");

        assertDoesNotThrow(() -> validator.validate(user));
    }

    @ParameterizedTest
    @MethodSource("invalidEmails")
    public void shouldThrowWhenEmailIsInvalid(String email){
        User user = new User("Anna", 20, email);
        assertThrows(InvalidUserException.class, () ->{
            validator.validate(user);
        });
    }

    @ParameterizedTest
    @MethodSource("validEmails")
    public void shouldNotThrowWhenEmailIsValid(String email){
        User user = new User("Anna", 20, email);

        assertDoesNotThrow(() -> validator.validate(user));
    }









}
