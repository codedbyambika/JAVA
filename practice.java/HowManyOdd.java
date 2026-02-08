import java.util.Scanner;
class HowManyOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int c=0;
        System.out.println("Enter the elements");
        for(int i=0; i<n;i++){
            int num=sc.nextInt();
            if(num%2!=0){
                c++;
            }
        }
        System.out.println("Number of odd elements: "+c);
        sc.close();

    }
}