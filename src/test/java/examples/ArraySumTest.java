package examples;

import org.junit.Test;

import static examples.ArraySum.getSum;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArraySumTest {
    @Test
    public void testSum(){
        int[] inputArray = {1, 2, 3, 4, 5};
        int result = getSum(inputArray);
        assertEquals(15,result);
        assertNotEquals(10,result);
    }
}
