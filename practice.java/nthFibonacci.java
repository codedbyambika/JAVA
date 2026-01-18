import java.util.Scanner;
class nthFibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth fibonacci number: ");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        if(n==1){
            System.out.println("Fibonacci number at position "+n+" is: "+a);
            return;
        }
        else if(n==2){
            System.out.println("Fibonacci number at position "+n+" is: "+b);
            return;
        }
        else{
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
        }
        System.out.println("Fibonacci number at position "+n+ " is: "+c);
        sc.close();
    }

}