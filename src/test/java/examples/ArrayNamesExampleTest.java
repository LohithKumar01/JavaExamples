package examples;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static examples.ArrayNamesExample.containsInArray;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class ArrayNamesExampleTest {

    @Test
    public void testArrayContainsName(){
        String[] nameArray = {"John", "Alice", "Joe", "Tony","Tina"};
        assertTrue(containsInArray(nameArray,"Tony"));
        assertFalse(containsInArray(nameArray, "Charlie"));

        assertThat(Arrays.asList("John","Tina","Joe","Tony"),hasItems("Joe","Tony"));

    }
}
