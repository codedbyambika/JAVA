import java.util.Scanner;
class SumOfEvenDigits{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int s=0;
        while(n>0){
            int d=n%10;
            if(d%2==0){
                s+=d;
            }
            n/=10;
        }
        System.out.println("Sum of even digits: "+s);
        sc.close();
    }
}