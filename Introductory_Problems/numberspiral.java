import java.io.*;
import java.util.*;

public class numberspiral {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            long y = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            long ans;
            if(y >= x){
                if(y % 2 == 0)
                    ans = y * y - x + 1;
                else
                    ans = (y - 1) * (y - 1) + x;
            }
            else{
                if(x % 2 == 1)
                    ans = x * x - y + 1;
                else
                    ans = (x - 1) * (x - 1) + y;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
