import java.util.Scanner;
class UniqueDigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n=sc.nextLong();
        n=Math.abs(n);
        int c=0;
        boolean[] seen=new boolean[10];
        while(n>0){
            int num=(int)(n%10);
            if(!seen[num]){
                seen[num]=true;
                c++;
            }
            n=n/10;
        }
        System.out.println("Number of unique digits: "+c);
        sc.close();
        
    }
}