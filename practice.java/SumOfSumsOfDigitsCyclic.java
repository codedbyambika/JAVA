import java.util.*;
public class SumOfSumsOfDigitsCyclic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int c = 0;
        while(n>0){
            int t = n%10;
            sum += t;
            n/=10;
            c++;
        }
        sum = sum*c;
        System.out.println(sum);
        sc.close();
    }
}