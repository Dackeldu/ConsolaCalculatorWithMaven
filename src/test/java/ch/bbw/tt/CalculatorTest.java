package ch.bbw.tt;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setup() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOK() {
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOK() {
        assertTrue(testee.subtraction(25, 10) == 15);
    }

    @Test
    public void testSubtractionPositiveMinusNegativeIsOK() {
        assertTrue(testee.subtraction(25, -10) == 35);
    }

    @Test
    public void testSummeZweiNegativeIsOK() {
        assertTrue(testee.summe(-10, -25) == -35);
    }

    @Test
    public void testGetterUndSetter() {
        testee.setCountOfCalculations(8);
        assertTrue(testee.getCountOfCalculations() == 8);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorDivision1() {
        assertTrue(testee.divide(Integer.MAX_VALUE , 3) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorDivision2() {
        assertTrue(testee.divide(Integer.MIN_VALUE , 3) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorSumme1() {
        assertTrue(testee.summe(Integer.MAX_VALUE , 3) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorSumme2() {
        assertTrue(testee.summe(Integer.MIN_VALUE , 3) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorSubtraction1() {
        assertTrue(testee.subtraction(Integer.MAX_VALUE , 3) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.AssertionError.class)
    public void assertionErrorSubtraction2() {
        assertTrue(testee.subtraction(Integer.MIN_VALUE , 3) == Integer.MAX_VALUE);
    }


    @Test(expected=java.lang.ArithmeticException.class)
    public void divideZeroError() {
        assertTrue(testee.divide(8 , 0) == Integer.MAX_VALUE);
    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void divideZeroByZero() {
        assertTrue(testee.divide(0 , 0) == 1);
    }

    @Test
    public void divideZeroIsOk() {
        assertTrue(testee.divide(0 , 912) == 0);
    }

    @Test
    public void divideNegativeIsOk() {
        assertTrue(testee.divide(-110 , 11) == -10);
    }

    @Test
    public void divideByNegativeIsOk() {
        assertTrue(testee.divide(110 , -11) == -10);
    }

    @Test
    public void divideNegativeByNegativeIsOk() {
        assertTrue(testee.divide(-110 , -11) == 10);
    }

}