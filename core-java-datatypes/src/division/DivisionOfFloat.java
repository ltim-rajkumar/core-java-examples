package division;

public class DivisionOfFloat {
/*
    Use case: Accept two numbers and display division of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the division using / operator
    Step 3: Show division of two numbers

*/

    public void division() {
        float a = 324.2f, b = 31f;
        float result = a / b;
        System.out.println("Division of two floating numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        DivisionOfFloat objDivOfFloat = new DivisionOfFloat();
        objDivOfFloat.division();
    }
}
