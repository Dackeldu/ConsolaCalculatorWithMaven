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
}