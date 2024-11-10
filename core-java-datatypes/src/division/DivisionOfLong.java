package division;

public class DivisionOfLong {
/*
    Use case: Accept two numbers and display division of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the division using / operator
    Step 3: Show division of two numbers

*/
    public void division() {
        long a = 9890901122L;
        long b = 9011002200L;
        long result = a / b;
        System.out.println("Division of two long numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        DivisionOfLong objDivOfLong = new DivisionOfLong();
        objDivOfLong.division();
    }
}
