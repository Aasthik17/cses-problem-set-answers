import java.util.Scanner;

public class bitstrings{
    public static void main(String[] args){
        long MOD = 1_000_000_007;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long res = 1;
        for(int i=0; i<n; i++) res = (res*2)%MOD;
        System.out.println(res);
    }
}
