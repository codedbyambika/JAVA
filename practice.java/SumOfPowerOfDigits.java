import java.util.*;
public class SumOfPowerOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pos = 0;
        int t = n;
        while(t>0){
            t/=10;
            pos++;
        }
        while(n>0){
            int d = n%10;
            sum += (int) Math.pow(d, pos);
            pos--;
            n/=10;
        }
        System.out.println(sum);
        sc.close();

    }
}