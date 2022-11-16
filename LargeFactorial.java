// Find the factorial of a large number. 

import java.math.BigInteger;

public class LargeFactorial {

    static BigInteger factorial(int N) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    public static void main(String args[]) throws Exception {
        int N = 20;
        System.out.println(factorial(N));
    }
}
