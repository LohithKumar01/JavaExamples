package examples;

import java.util.Arrays;

public class ArrayNamesExample {
    public static void main(String[] args) {
        String[] actualArray = {"Leo", "Tim", "Mark", "Kim", "Bruce"};
        String[] expectedArray = {"Leo", "Alice"};

        for (String expected : expectedArray) {
            boolean result = containsInArray(actualArray, expected);
            System.out.println(result);
        }
    }

    public static boolean containsInArray(String[] array, String element) {
        for (String str : array) {
            if (str.equals(element)) {
                return true;
            }
        }
        return false;
    }
}