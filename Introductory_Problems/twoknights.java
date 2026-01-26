import java.util.*;
import java.io.*;

public class twoknights{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long k = Long.parseLong(br.readLine());
        
        for(long i=1; i<=k; i++) System.out.println((i*i*(i*i-1))/2 - 4*(i-1)*(i-2));
    }
}
