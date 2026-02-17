import java.util.*;
import java.io.*;

public class countingdivisors{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int MAX=1000000;
        int[] divisors = new int[MAX+1];
        for(int i=1; i<=MAX; i++){
            for(int j=i; j<=MAX; j += i){
                divisors[j]++;
            }
        }
        while(n-->0){
            int x=Integer.parseInt(br.readLine());
            System.out.println(divisors[x]);
        }
    }
}
