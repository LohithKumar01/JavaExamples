package maps;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetExampleTest {
    @Test
    public void testAdd(){
        Set<String> set = Set.of("John","Joe","Tom","Tim","Carrie");

        int sizeOfSet = set.size();
        assertTrue(sizeOfSet==5);
        assertTrue(set.contains("Carrie"));

        assertFalse(set.isEmpty());

    }
}
