import java.util.*;
import java.io.*;

public class exponentiation{
    static final long MOD = 1_000_000_007;

    static long modPow(long a, long b) {
        long result=1;
        a %= MOD;
        while(b>0){
            if((b&1) == 1){
                result = (result*a) % MOD;
            }
            a = (a*a) % MOD;
            b >>= 1;
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            sb.append(modPow(a,b)).append('\n');
        }
        System.out.print(sb.toString());
    }
}
