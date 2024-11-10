package division;

public class DivisionOfInteger {
/*
    Use case: Accept two numbers and display division of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the division using / operator
    Step 3: Show division of two numbers

*/
    public void division() {
        int a = 1700;
        int b = 400;
        int result = a / b;
        System.out.println("Division of two int numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        DivisionOfInteger objDivOfInt = new DivisionOfInteger();
        objDivOfInt.division();
    }
}
