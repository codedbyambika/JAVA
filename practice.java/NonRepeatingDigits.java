import java.util.Scanner;
class NonRepeatingDigits{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        Long n= sc.nextLong();
        int freq[]=new int[10];
        n=Math.abs(n);
        int c=0;
        while(n>0){
            int d=(int)(n%10);
            freq[d]++;
            n=n/10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]==1)
            c++;
        }
        System.out.println("Number of non repeating digits: "+c);
        sc.close();
    }    
}