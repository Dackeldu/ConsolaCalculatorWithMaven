package ch.bbw.tt;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Test
    public void testSummeZweiPositiveIsOK() {
        testee = new Calculator();
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSubtractionZweiPositiveIsOK() {
        testee = new Calculator();
        assertTrue(testee.subtraction(25, 10) == 15);
    }

    @Test
    public void testSubtractionPositiveMinusNegativeIsOK() {
        testee = new Calculator();
        assertTrue(testee.subtraction(25, -10) == 35);
    }

    @Test
    public void testSummeZweiNegativeIsOK() {
        testee = new Calculator();
        assertTrue(testee.summe(-10, -25) == -35);
    }


}