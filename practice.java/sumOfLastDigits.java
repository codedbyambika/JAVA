import java.util.Scanner;
class sumOfLastDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter second number: ");
        int n2=sc.nextInt();
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        int sum=n1%10 + n2%10;
        System.out.println("The sum of last digits of two numbers is: "+sum);
        sc.close();
    }
}