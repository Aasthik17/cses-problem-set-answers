import java.io.*;
import java.util.*;

public class fibonaccinumbers {
    static final long MOD=1000000007;
    static long[] fib(long n){
        if(n==0){
            return new long[]{0,1};
        }

        long[] p = fib(n/2);
        long a=p[0];
        long b=p[1];

        long c=(a*((2*b%MOD-a+MOD)%MOD))%MOD;
        long d = (a * a % MOD + b * b % MOD)%MOD;

        if (n % 2 == 0) {
            return new long[]{c, d};
        } else {
            return new long[]{d, (c + d) % MOD};
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        System.out.println(fib(n)[0]);
    }
}
