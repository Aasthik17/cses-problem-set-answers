import java.util.*;
import java.io.*;

public class sumoftwovalues{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Map<Long, Integer> res = new HashMap<>();
        for(int i=1; i<=n; i++){
            long num = Long.parseLong(st.nextToken());
            long complement = x - num;
            if(res.containsKey(complement)){
                System.out.println(res.get(complement)+" "+i);
                return;
            }
            res.put(num, i);
        }
        System.out.println("IMPOSSIBLE");
        return;
    }
}
