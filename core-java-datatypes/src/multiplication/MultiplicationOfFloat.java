package multiplication;

public class MultiplicationOfFloat {
/*
    Use case: Accept two numbers and display multiplication of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the multiplication using astric * operator
    Step 3: Show multiplication of two numbers

*/
    public float multi(float i, float j) {
        return i * j;
    }

    public static void main(String[] args) {
        float i = 100.44f, j = 3.1f, result;
        result = new MultiplicationOfFloat().multi(i, j);
        System.out.println("Multiplication of " + i + " and " + j + " = " + result);
    }

}
