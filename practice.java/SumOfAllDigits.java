import java.util.Scanner;
class SumOfAllDigits{
    public static int sumOfDigit(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sign= (n<0)? -1:1;
        n=Math.abs(n);
        int s=0;
        s=sumOfDigit(n);
        if(s>10){
            s=sumOfDigit(s);
            sc.close();
        }
        s=sign*s;
        System.out.println("Sum of all digits: "+s);
        sc.close();
    }
}