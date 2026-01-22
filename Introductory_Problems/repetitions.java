import java.util.Scanner;

public class repetitions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        
        int res=0;
        int cur=0;
        char ch=st.charAt(0);
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i) == ch){
                cur++;
            }
            else{
                ch=st.charAt(i);
                cur=1;
            }
            res=Math.max(res, cur);
        }
        System.out.println(res);
    }
}
