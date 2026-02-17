import java.util.*;
import java.io.*;

public class slidingwindowminimum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long[] arr = new long[n];
        arr[0]=x;
        for(int i=1; i<n; i++){
            arr[i]=(arr[i-1]*a+b)%c;
        }
        
        Deque<Integer> dq = new ArrayDeque<>();
        
    }
}
