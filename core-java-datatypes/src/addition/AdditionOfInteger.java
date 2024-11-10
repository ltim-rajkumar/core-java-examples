package addition;

public class AdditionOfInteger {
/*
    Use case: Accept two numbers and display sum of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the addition using + operator
    Step 3: Show sum of two numbers

*/
    public void add() {
        int a = 700;
        int b = 400;
        int result = a + b;
        System.out.println("Addition of two int numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        AdditionOfInteger objAddOfInt = new AdditionOfInteger();
        objAddOfInt.add();
    }
}
