import java.util.Scanner;

public class missingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n=sc.nextLong();
        long actualSum=(n*(n+1))/2;
        
        long inputSum=0;
        for(int i=1; i<n; i++) inputSum += sc.nextLong();
        
        System.out.println(actualSum-inputSum);
    }
}
