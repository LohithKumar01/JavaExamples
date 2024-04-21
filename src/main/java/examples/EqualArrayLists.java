package examples;

import java.util.Arrays;

public class EqualArrayLists {
    public static void main(String[] args) {
        int[] sizeArray1 = {5, 4, 3, 2, 1};
        int[] sizeArray2 = {5, 4, 3, 2, 1};
        equalArray(sizeArray1, sizeArray2);
    }

    static void equalArray(int[] sizeArray1, int[] sizeArray2) {
        if (Arrays.equals(sizeArray1, sizeArray2)){
            System.out.println("Both Arrays are Equal.");
        }
        else {
            System.out.println("Arrays are not equal.");
        }
    }
}
