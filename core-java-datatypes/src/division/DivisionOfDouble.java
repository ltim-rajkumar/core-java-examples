package division;

public class DivisionOfDouble {
    /*
        Use case: Accept two numbers and display division of those numbers

        Pseudocode:

        Step 1: Get two numbers and initialize values
        Step 2: Perform the division using / operator
        Step 3: Show division of two numbers

    */
    public void division() {
        double a = 232.91;
        double b = 34.03;
        double result = a / b;
        System.out.println("Division of two double numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        DivisionOfDouble objDivOfDbl = new DivisionOfDouble();
        objDivOfDbl.division();
    }
}