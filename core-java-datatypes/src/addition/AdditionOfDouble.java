package addition;

public class AdditionOfDouble {
    /*
        Use case: Accept two numbers and display sum of those numbers

        Pseudocode:

        Step 1: Get two numbers and initialize values
        Step 2: Perform the addition using + operator
        Step 3: Show sum of two numbers

    */
    public void add() {
        double a = 7711.321;
        double b = 9999.91;
        double result = a + b;
        System.out.println("Addition of two double numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        AdditionOfDouble objAddOfDbl = new AdditionOfDouble();
        objAddOfDbl.add();
    }
}