package subtraction;

public class SubtractionOfInteger {
    /*
        Use case: Accept two numbers and display subtraction of those numbers

        Pseudocode:

        Step 1: Get two numbers and initialize values
        Step 2: Pass those two params to one method that returns the subtraction using - operator
        Step 3: Show subtraction of two numbers

    */
    public int getResult(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        SubtractionOfInteger objSubOfInt = new SubtractionOfInteger();
        int a = 6575, b = 345;
        System.out.println("Subtraction of " + a + " and " + b + " is equal to: " + (objSubOfInt.getResult(a, b)) );
    }

}

