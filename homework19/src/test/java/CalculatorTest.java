import homework19.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public static Calculator calculator;

    @BeforeAll
    public static void initializingCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("getTestSumArguments")
    public void testSum(String testName, int x, int y, int expectedResult) {
        int actualResult = calculator.add(x, y);

        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> getTestSumArguments() {
        return Stream.of(
                Arguments.of( "adding positive integers", 5, 4, 9),
                Arguments.of("adding negative integers", -5, -2, -7),
                Arguments.of("adding positive and negative integers for 0", 3, -3, 0),
                Arguments.of("adding zero to zero", 0, 0, 0)
        );
    }

    @Test
    @DisplayName("Difference of 2 numbers")
    public void testSubtract() {
        final int expectedResult = -27;

        int actualResult = calculator.subtract(1996, 2023);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Difference of 2 negative numbers")
    public void testSubtractNegative() {
        final int expectedResult = 10;

        int actualResult = calculator.subtract(-10, -20);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6"})
    @DisplayName("Multiplying 2 numbers")
    public void testMultiply(int x, int y, int expectedResult) {
        int actualResult = calculator.multiply(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {9, 18})
    @DisplayName("Dividing number by itself")
    public void testDivision(int x) {
        int expectedResult = 1;

        int actualResult = calculator.divide(x, x);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Dividing number by zero")
    public void testDivisionByZero() {
        final int expectedResult = 0;

        int actualResult = calculator.divide(10, 0);

        assertEquals(expectedResult, actualResult);
    }

    @AfterAll
    public static void printFinalText() {
        System.out.println("All tests were completed");
    }
}
