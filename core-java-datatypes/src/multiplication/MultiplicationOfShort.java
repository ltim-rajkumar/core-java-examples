package multiplication;

public class MultiplicationOfShort {
/*
    Use case: Accept two numbers and display multiplication of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the multiplication using astric * operator
    Step 3: Show multiplication of two numbers

*/

    public void multi() {
        short i = 90, j = 3;
        System.out.println("Multiplication of " + i + " and " + j + " is equal to:  " + (i * j));
    }

    public static void main(String[] args) {
        MultiplicationOfShort objMultiOfShort = new MultiplicationOfShort();
        objMultiOfShort.multi();
    }

}
