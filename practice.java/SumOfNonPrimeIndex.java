import java.util.*;
public class SumOfNonPrimeIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            if(!isPrime(i)){
                sum +=arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
    public static boolean isPrime(int x){
        if(x<2) return false;
        for(int j=2;j*j<=x;j++){
            if(x%j==0) return false;
        }
        return true;
    }
}