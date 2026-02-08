import java.util.Scanner;
class SecondLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        n=Math.abs(n);
        if(n<10){
            System.out.println("No second last digit");
            sc.close();
            return;
        }
        int secondlastdigit=(n/10)%10;
        System.out.println("The second last digit is: "+secondlastdigit);
        sc.close();
    }
}