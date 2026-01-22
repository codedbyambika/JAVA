import java.util.Scanner;
class DigitCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        n=Math.abs(n);
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        System.out.println("Number of digits: "+c);
        sc.close();
    }
}