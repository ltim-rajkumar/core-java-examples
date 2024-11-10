package division;

public class DivisionOfShort {
    /*
        Use case: Accept two numbers and display division of those numbers

        Pseudocode:

        Step 1: Get two numbers and initialize values
        Step 2: Perform the division using / operator
        Step 3: Show division of two numbers

    */
    public void division() {
        short a = 11;
        short b = 2;
        System.out.println("Division of two short numbers " + a + " and " + b + " is equal to: " + (a / b));
    }

    public static void main(String[] args) {
        DivisionOfShort objDivOfShort = new DivisionOfShort();
        objDivOfShort.division();
    }
}
