package examples;

import org.junit.Test;


import static examples.EqualArrayLists.equalArray;
import static org.junit.Assert.assertArrayEquals;

public class EqualArrayListsTest {
    @Test
    public void testEqualArray(){
        int[] expected = {5,4,3,2,1};
        int[] actual = {5,4,3,2,1};
        assertArrayEquals("Not Equal",expected,actual);
    }
}
