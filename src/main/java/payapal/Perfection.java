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