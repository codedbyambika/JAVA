import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        n=Math.abs(n);
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(original==rev){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}