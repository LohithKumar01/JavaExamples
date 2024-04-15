package examples;

public class ArraySum {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5};
        int sum = getSum(numberArray);
        System.out.println(sum);
    }
    public static int getSum(int[] numberArray) {
        int sum = 0;                                        //Take a temp variable like sum. i represents index value
        for (int i = 0; i<= numberArray.length -1; i++){
            sum = sum + numberArray[i];                     //numberArray[i] stores the value.
        }
        return sum;
    }
}
