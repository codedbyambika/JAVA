import java.util.*;
public class DecreasingSequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int len = 1;
        int maxlen = 0;
        int seq = 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                len++;
            }else{
                if(len>1){
                    seq++;
                    maxlen = Math.max(maxlen, len);
                }
                len = 1;
            }
        }if(len>1){
            seq++;
            maxlen = Math.max(maxlen, len);
        }
        System.out.println(seq+" "+maxlen);
        sc.close();
    }
}