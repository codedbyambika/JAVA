import java.util.Scanner;
class CreatePIN{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int p=sc.nextInt();
        System.out.print("Enter second number: ");
        int q=sc.nextInt();
        System.out.print("Enter third number: ");
        int r=sc.nextInt();

        int p1=p%10;
        int p2=(p/10)%10;
        int p3=p/100;

        int q1=q%10;
        int q2=(q/10)%10;
        int q3=q/100;

        int r1=r%10;
        int r2=(r/10)%10;
        int r3=r/100;

        int u=Math.min(Math.max(p1,q1),r1);
        int t=Math.min(Math.max(p2,q2),r2);
        int h=Math.min(Math.max(p3,q3),r3);
        
        int m1=Math.max(Math.max(p1,p2),p3);
        int m2=Math.max(Math.max(q1,q2),q3);
        int m3=Math.max(Math.max(r1,r2),r3);

        int th=Math.max(Math.max(m1,m2),m3);

        int ans=th*1000+h*100+t*10+u;
        System.out.println("PIN is: "+ans);
        sc.close();

    }
}