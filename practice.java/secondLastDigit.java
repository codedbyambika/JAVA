import java.util.Scanner;
class secondLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int secondlastdigit=(n/10)%10;
        System.out.println("The second last digit is: "+secondlastdigit);
        sc.close();
    }
}