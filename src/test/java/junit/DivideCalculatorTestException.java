package junit;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivideCalculatorTestException {
    @Test
    public void testDivision_WithDenominatorZero() {
        Throwable exception = assertThrows(ArithmeticException.class,()->
                DivideCalculator.divide(2,0));
        assertEquals("Invalid Denominator.",exception.getMessage());
    }
    @Test
    public void testDivision_WithDenominatorZero1() {
        assertThrows("Invalid Denominator.",ArithmeticException.class,()->
                DivideCalculator.divide(2,0));
    }
    @Test(expected = RuntimeException.class)
    public void testDivision(){
        int result= DivideCalculator.divide(2, 0);
        assertEquals("Invalid Denominator.",result);

    }

    @Test
    public void divisionWithNumeratorZero() {
        int result = DivideCalculator.divide(8, 4);
        assertEquals(2, result);
    }
}
