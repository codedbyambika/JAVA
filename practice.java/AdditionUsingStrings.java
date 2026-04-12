import java.util.*;
public class AdditionUsingStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;     
        int i = s1.length()-1;
        int j = s2.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int n1 = (i>=0)? s1.charAt(i)-'0' : 0;
            int n2 = (j>=0)? s2.charAt(j)-'0' : 0;
            sum = n1 + n2 + carry;
            carry = sum/10;
            sb.append(sum%10);
            i--;
            j--;
        } 
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}