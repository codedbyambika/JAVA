import java.util.Scanner;
class IsPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int freq[]=new int [10];
        n=Math.abs(n);
        while(n>0){
            int d=n%10;
            freq[d]++;
            n/=10;
        }
        int oddcount=0;
        for(int i=0;i<10;i++){
            if(freq[i]%2!=0){
                oddcount++;
            }
        }
        if(oddcount>1){
            System.out.println("Number cannot form palindrome");
        }else{
            System.out.println("Number can form palindrome");
        }
        sc.close();
    }
}