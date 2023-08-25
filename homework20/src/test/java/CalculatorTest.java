import homework20.Calculator;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class CalculatorTest {
    public static Calculator calculator;

    @BeforeClass
    public static void initializingCalculator() {
        calculator = new Calculator();
    }


    @Test(dataProvider = "testSumArgument")
    public void testSum(String testName, int x, int y, int expectedResult) {
        int actualResult = calculator.add(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @DataProvider(name = "testSumArgument")
    public static Object[][] getTestSumArguments() {
        return new Object[][]{
                {"adding positive integers", 5, 4, 9},
                {"adding negative integers", -5, -2, -7},
                {"adding positive and negative integers for 0", 3, -3, 0},
                {"adding zero to zero", 0, 0, 0}
        };
    }

    @Test(testName = "difference of 2 numbers")
    public void testSubtract() {
        final int expectedResult = -27;

        int actualResult = calculator.subtract(1996, 2023);

        assertEquals(expectedResult, actualResult);
    }

    @Test(testName = "difference of 2 negative numbers")
    public void testSubtractNegative() {
        final int expectedResult = 10;

        int actualResult = calculator.subtract(-10, -20);

        assertEquals(expectedResult, actualResult);
    }


    @Test(testName = "multiplying 2 numbers")
    @Parameters({"x", "y", "expectedResult"})
    public void testMultiply(int x, int y, int expectedResult) {
        int actualResult = calculator.multiply(x, y);

        assertEquals(expectedResult, actualResult);
    }

    @Test(testName = "divide 2 numbers")
    public void testDivision() {
        int x = 8;
        int expectedResult = 1;

        int actualResult = calculator.divide(x, x);

        assertEquals(expectedResult, actualResult);
    }

    @Test(testName = "dividing number by zero")
    public void testDivisionByZero() {
        final int expectedResult = 0;

        int actualResult = calculator.divide(10, 0);

        assertEquals(expectedResult, actualResult);
    }

    @AfterClass
    public static void printFinalText() {
        System.out.println("All tests were completed");
    }
}
