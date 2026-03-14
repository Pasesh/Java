package practice_10_hw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends MethodsTest{

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 202})
    void shouldReturnFalseForCommonYears(int inputYears){
        assertFalse(methods.isLeapYear(inputYears));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    void shouldReturnTrueForLeapYears(int inputYears){
        assertTrue(methods.isLeapYear(inputYears));
    }

    @ParameterizedTest
    @ValueSource(ints = {900, 2100})
    void shouldReturnFalseForCenturiesNotDivisibleBy400(int inputYears){
        assertFalse(methods.isLeapYear(inputYears));
    }
}
