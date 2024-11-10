package subtraction;

public class SubtractionOfDouble {
/*
    Use case: Accept two numbers and display subtraction of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the subtraction using hyphen - operator
    Step 3: Show subtraction of two numbers

*/

    public void sub() {
        double a = 9000.95;
        double b = 5000.90;
        double result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " = " + result);
    }

    public static void main(String[] args) {
        SubtractionOfDouble objSubOfDbl = new SubtractionOfDouble();
        objSubOfDbl.sub();
    }

}
