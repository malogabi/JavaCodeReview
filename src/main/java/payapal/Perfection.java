/**
 * Review by carlos
 This class determine if a number is perfection or not.

Definition of a Perfect Number:
In mathematics a perfect number is defined as an integer which is the sum of its proper
positive divisors; that is, the sum of the positive divisors not including the number itself.
Some examples of perfect numbers are:

6 = 1 + 2 + 3
28 = 1 + 2 + 4 + 7 + 14
496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248
**/
package main.java.payapal;

public class Perfection {

    private static Perfection perf;

    public synchronized static Perfection getPerf() {
        if (perf == null) {
            perf = new Perfection();
        }
        return perf;
    }


    public static boolean isPerfect(long candidate) {
        boolean retVal;
        long[] divisors = GetDivisors(candidate);
        int sum = 0;
        for (int d = 0; d < 1000; d++)
        {
            sum = sum + divisors[d];
        }
        if (sum == candidate)
            retVal = true;
        return retVal;
    }


    private static long[] GetDivisors(long candidate) {
        long[] divisors = new long[];
        int d = 0;
        for (long i = 0; i < candidate; i++) {
            long foo = candidate / i;
            if (foo * i == candidate) {
                divisors[d] = i;
                d = d + 1;
            }
        }
        return divisors;
    }

}