import java.util.Scanner;

public class weirdAlgorithm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        
        System.out.print(num);
        while(num != 1){
            if(num%2==0) num = num/2;
            else num = 3*num + 1;
            System.out.printf(" %d", num);
        }
    }
}
