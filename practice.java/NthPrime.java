import java.util.Scanner;
class NthPrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find nth prime: ");
        int n=sc.nextInt();
        int c=0;
        int num=0;
        while(c<n){
            num++;
            boolean isPrime=true;
            if(num<=1){
                isPrime=false;
            }
            for(int i=2;i*i<=num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                c++;
            }
        }
        System.out.println("The "+n+"th prime number is: "+num);    
    }
}