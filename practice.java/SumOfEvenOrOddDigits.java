import java.util.Scanner;
class SumOfEvenOrOddDigits{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("Enter even or odd");
        String ch=sc.next();
        n=Math.abs(n);
        int even=0;
        int odd=0;
        while(n>0){
            int d=n%10;
            if(d%2==0){
                even+=d;
            }else{
                odd+=d;
            }
            n/=10;
        }
        if(ch.equals("even")){
        System.out.println("Sum of even digits: "+even);
        }else{
        System.out.println("Sum of odd digits: "+odd);
        } 
         sc.close();
    }
}