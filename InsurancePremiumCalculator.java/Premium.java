import java.util.Scanner;
public class Premium{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of Building (Domestic or Commercial) : ");
        String B = sc.nextLine();
        System.out.println("Enter the amount insured : ");
        float A = sc.nextFloat();
        System.out.println("Enter the number of previous claims : ");
        int C = sc.nextInt();

        double premium = 0.0;
        double processingCharge = 0.0;
        double discountRate = 0.0;

        if(B.equalsIgnoreCase("Domestic")){
            if(A < 100000){
                premium = A * 0.003;
            }else{
                premium = A * 0.0025;
            }
            processingCharge = 50;
            if(C == 0){
                discountRate = 0.10;
            }
        }
        if(B.equalsIgnoreCase("Commercial")){
            if(A < 250000){
                premium = A * 0.005;
            }else{
                premium = A * 0.0075;
            }
            processingCharge = 80;
            if(C == 0){
                discountRate = 0.15;
            }
        }
        
        double total = premium + processingCharge;
        double discount = total * discountRate;
        double finalPremium = total - discount;

        System.out.printf("%.2f", finalPremium);
        sc.close();
    }
}