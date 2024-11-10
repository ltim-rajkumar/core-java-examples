package multiplication;

public class MultiplicationOfDouble {
/*
    Use case: Accept two numbers and display multiplication of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the multiplication using astric * operator
    Step 3: Show multiplication of two numbers

*/
    public double multi(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double a = 3322.234, b = 9213.3276;
        MultiplicationOfDouble objMultiOfDbl = new MultiplicationOfDouble();
        double result = objMultiOfDbl.multi(a, b);
        System.out.println("Multiplication of " + a + " and " + b + " = " + result);
    }

}
