import java.util.Scanner;
class PrimeInRange{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter starting number:");
        int s=sc.nextInt();
        System.out.print("Enter ending number:");
        int e=sc.nextInt();
        int c=0;
        for(int i=s;i<=e;i++){
            boolean isPrime=true;
            if(i<=1){
                isPrime=false;
                continue;
            }
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Prime numbers between "+s+" and "+e+" are : "+c);
        sc.close();
    }
}