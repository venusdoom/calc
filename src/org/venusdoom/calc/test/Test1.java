package org.venusdoom.calc.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.venusdoom.calc.calculations.Operations;

public class Test1 {

    Operations tester = new Operations();

    @Test
    public void testSum() {
        assertEquals(5.0, tester.sum(2, 3), 1e-8);
    }

    @Test
    public void testDiff() {
        assertEquals(5.0, tester.diff(10, 5), 1e-8);
    }

    @Test
    public void testMult() {
        assertEquals(10.0, tester.mult(2, 5), 1e-8);
    }

    @Test
    public void testDiv() {
        assertEquals(5.0, tester.div(25, 5), 1e-8);
    }

}
