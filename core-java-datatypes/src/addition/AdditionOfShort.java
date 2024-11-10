package addition;

public class AdditionOfShort {
    /*
        Use case: Accept two numbers and display sum of those numbers

        Pseudocode:

        Step 1: Get two numbers and initialize values
        Step 2: Perform the addition using + operator
        Step 3: Show sum of two numbers

    */
    public void add() {
        short a = 1;
        short b = 2;
        System.out.println("Addition of two short numbers " + a + " and " + b + " is equal to: " + (a + b));
    }

    public static void main(String[] args) {
        AdditionOfShort objAddOfShort = new AdditionOfShort();
        objAddOfShort.add();
    }
}
