import java.io.*;
import java.util.*;

public class distinctnumbers{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashSet<Long> hs = new HashSet<>();
        
        for(int i=0; i<n; i++){
            hs.add(Long.parseLong(st.nextToken()));
        }
        
        System.out.println(hs.size());
    }
}
