import java.util.*;
public class RobotMovement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        int i=0, j=0;
        for(char ch : s.toCharArray()){
            if(ch == 'L') j--;
            else if(ch == 'R') j++;
            else if(ch == 'U') i++;
            else if(ch == 'D') i--;
        }
        System.out.println((i==0 && j==0)? "YES" : "NO");
    }
}