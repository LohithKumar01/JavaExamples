package examples;

import org.junit.Test;

import static examples.ArrayPalindrome.isPalindrome;
import static org.junit.Assert.assertEquals;

public class ArrayPalindromeTest {
    @Test
    public void testPalindrome(){
        int[] firstArray = {1, 2, 3, 2, 1};
        assertEquals("is Palindrome.",isPalindrome(firstArray));
    }
}