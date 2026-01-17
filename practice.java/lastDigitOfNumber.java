import java.util.Scanner;
class lastDigitOfNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int lastDigit=n%10;
        System.out.println("The last digit is: "+lastDigit);
        sc.close();
    }
}