package addition;

public class AdditionOfLong {
/*
    Use case: Accept two numbers and display sum of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the addition using + operator
    Step 3: Show sum of two numbers

*/
    public void add() {
        long a = 9890901122L;
        long b = 9011002200L;
        long result = a + b;
        System.out.println("Addition of two long numbers " + a + " and " + b + " is equal to: " + result);
    }

    public static void main(String[] args) {
        AdditionOfLong objAddOfLong = new AdditionOfLong();
        objAddOfLong.add();
    }
}
