package methods;

import org.junit.Test;

import static loops.PrimeNumberOrNot.isPrime;
import static methods.MethodExercise.calculateHighScorePosition;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MethodExerciseTest {
    @Test
    public void testCalculateHighScorePosition(){
        int playerScore = 500;
        int result = calculateHighScorePosition(playerScore);
        assertEquals(2,result);
    }
    @Test
    public void testIsPrime(){
        int number = 17;
        boolean result= isPrime(number);
        assertEquals(true,result);
        assertTrue("is Prime.",true);
    }
}
