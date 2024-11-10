package multiplication;

public class MultiplicationOfInteger {
/*
    Use case: Accept two numbers and display multiplication of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the multiplication using astric * operator
    Step 3: Show multiplication of two numbers

*/

    public void multiplication() {
        int i = 90, j = 10;
        int result = i * j;
        System.out.println("Multiplication of " + i + " and " + j + " = " + result);
    }

    public static void main(String[] args) {
        MultiplicationOfInteger objMultiOfInt = new MultiplicationOfInteger();
        objMultiOfInt.multiplication();
    }

}
