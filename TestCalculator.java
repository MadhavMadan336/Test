package tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAdd1() {
        Calculator obj1 = new Calculator();
        int result = obj1.add(5, 7);
        assertEquals(12, result);
    }

    @Test
    public void testAdd2() {
        Calculator obj1 = new Calculator();
        int result = obj1.add(4, 7);
        assertEquals(11, result);  // Fixed expected value
    }

    @Test
    public void testDivide() {
        Calculator obj1 = new Calculator();
        double result = obj1.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.0001); // Delta for floating point precision
    }

    @Test
    public void testDivideByZero() {
        Calculator obj1 = new Calculator();
        assertThrows(ArithmeticException.class, () -> obj1.divide(10.0, 0.0));
    }
}
