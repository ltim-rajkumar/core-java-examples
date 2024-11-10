package addition;

public class AdditionOfFloat {
/*
    Use case: Accept two numbers and display sum of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the addition using + operator
    Step 3: Show sum of two numbers

*/

    public void add() {
        float a = 100.2f, b = 300.5f;
        float result = a + b;
        System.out.println("Addition of two floating numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        AdditionOfFloat objAddOfFloat = new AdditionOfFloat();
        objAddOfFloat.add();
    }
}
