import java.util.*;
import java.io.*;

public class moviefestival{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] movies = new long[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            movies[i][0] = Long.parseLong(st.nextToken()); // start
            movies[i][1] = Long.parseLong(st.nextToken()); // end
        }
        Arrays.sort(movies, (a,b) -> Long.compare(a[1], b[1]));

        int count=0;
        long lastEnd=0;
        for(int i=0; i<n; i++){
            if(movies[i][0] >= lastEnd){
                count++;
                lastEnd = movies[i][1];
            }
        }
        System.out.println(count);
    }
}
