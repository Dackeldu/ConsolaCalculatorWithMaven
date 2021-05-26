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


}