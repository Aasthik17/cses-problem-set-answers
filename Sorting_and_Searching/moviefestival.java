import java.util.*;
import java.io.*;

public class moviefestival{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int count=1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = Long.parseLong(st.nextToken());
        long end = Long.parseLong(st.nextToken());
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            long curS = Long.parseLong(st.nextToken());
            long curE = Long.parseLong(st.nextToken());
            if(curS>=end){
                count++;
                end = curE;
            }
        }
        System.out.println(count);
    }
}
