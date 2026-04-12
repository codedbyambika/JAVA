import java.util.*;
public class FindStringCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int sum = 0;
        for(String ch : s){
            char c1 = ch.charAt(0);
            char c2 = ch.charAt(ch.length()-1);
            int n1 = (int)c1;
            int n2 = (int)c2;
            int rev =0;
            while(n2>0){
                int d = n2%10;
                rev = rev*10 + d;
                n2/=10;
            }
            sum += n1 + rev;
        }
        System.out.println(sum);
        sc.close();
    }
}