import java.util.*;
public class MostFreqOccuringDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[10];
        for(int i=0;i<n;i++){
            int t = arr[i];
            while(t>0){
                int d = t%10;
                freq[d]++;
                t/=10;
            }
        }
        int maxfreq = 0;
        int digit = 0;
        for(int i=0;i<10;i++){
            if(freq[i]>maxfreq){
                maxfreq = freq[i];
                digit = i;
            }
        }
        System.out.println(digit);
        sc.close();
    }
}