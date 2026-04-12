import java.util.*;
public class SimpleEncodedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans[0] = arr[0]; 
        for(int i=1;i<n;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}