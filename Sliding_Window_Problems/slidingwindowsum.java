import java.util.*;
import java.io.*;

public class slidingwindowsum{
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
        long res=0L;
        long currSum=x;
        int start=0;
        long[] arr = new long[n];
        arr[0]=x;
        for(int i=0; i<n; i++){
            if(i>0){
                arr[i] = (arr[i-1]*a+b)%c;
                currSum += arr[i];
            }
            if((i-start+1)==k){
                res = res ^ currSum;
                currSum = currSum - arr[start];
                start++;
            }
        }
        System.out.println(res);
    }
}
