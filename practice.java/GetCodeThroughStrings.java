import java.util.*;
public class GetCodeThroughStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int sum = 0;
        int pos = 1;
        for(int i=0;i<s.length;i++){
            int len = s[i].length();
            sum += len*pos;
            pos++;
        }
        System.out.println(sum);
        sc.close();
    }
}