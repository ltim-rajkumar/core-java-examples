package subtraction;

public class SubtractionOfFloat {
/*
    Use case: Accept two numbers and display subtraction of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the subtraction using hyphen - operator
    Step 3: Show subtraction of two numbers

*/
    public float getSubtraction(float a, float b) {
        return a - b;
    }

    public static void main(String[] args) {
        SubtractionOfFloat objSugOfFloat = new SubtractionOfFloat();
        float a = 2323.f, b = 1.3f, result;
        result = objSugOfFloat.getSubtraction(a, b);
        System.out.println("Subtraction of " + a + " and " + b + " is equal to: " + result);
    }

}
