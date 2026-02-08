import java.util.Scanner;
class ExactMultiple{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1=sc.nextInt();
        System.out.print("Enter second number: ");
        int n2=sc.nextInt();
        if(n1==0 || n2==0) {
            System.out.println("Exact multiple check is not defined for zero");
            sc.close();
            return;
        }
        if(n1%n2==0){
            System.out.println(n1+" is an exact multiple of "+n2);
        }
        else{
            System.out.println(n1+" is not an exact multiple of "+n2);
        }
        sc.close();
    }
}