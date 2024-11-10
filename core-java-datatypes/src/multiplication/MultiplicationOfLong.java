package multiplication;

public class MultiplicationOfLong {
/*
    Use case: Accept two numbers and display multiplication of those numbers

    Pseudocode:

    Step 1: Get two numbers and initialize values
    Step 2: Perform the multiplication using astric * operator
    Step 3: Show multiplication of two numbers

*/
    public long multi(long a, long b) {
        return a * b;
    }

    public static void main(String[] args) throws InterruptedException {

        MultiplicationOfLong objMultiOfLong = new MultiplicationOfLong();
        long a = 12312894293232L;
        long b = 398763232L;
        long result = objMultiOfLong.multi(a, b);
        System.out.println("Multiplication of " + a + " and " + b + " is "+ result);

    }

}
