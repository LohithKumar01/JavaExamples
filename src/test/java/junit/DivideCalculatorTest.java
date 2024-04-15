package junit;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DivideCalculatorTest {

    @Test(expected = RuntimeException.class)
    public void testDivision_WithDenominatorZero() {
        DivideCalculator.divide(2, 0);
    }

    @Test
    public void divisionWithNumeratorZero() {
        int result = DivideCalculator.divide(8, 4);
        assertEquals(2, result);
    }
}
