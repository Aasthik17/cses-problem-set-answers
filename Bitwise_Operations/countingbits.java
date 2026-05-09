import java.util.*;
import java.io.*;

public class countingbits{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long res=0;
        for(int i=1; i<=n; i<<=1){
            long rep=i<<1;
            res += (n/rep)*i;
            long rem=n%rep;
            res += Math.max(0L, rem-i+1);
        }
        System.out.println(res);
    }
}
