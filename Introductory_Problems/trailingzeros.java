import java.util.Scanner;

public class trailingzeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long factor = 5;
        long sum = 0;
        while(n >= factor){
            sum += n/factor;
            factor *= 5;
        }
        System.out.println(sum);
    }
}
