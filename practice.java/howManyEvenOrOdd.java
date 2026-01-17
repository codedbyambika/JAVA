import java.util.Scanner;
class howManyEvenOrOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemets: ");
        int n=sc.nextInt();
        int evenc=0;
        int oddc=0;
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evenc++;
            }else{
                oddc++;
            }
        }
        System.out.println("Number of even elements: "+evenc);
        System.out.println("Number of odd elements: "+oddc);
        sc.close();
    }
}