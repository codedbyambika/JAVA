import java.util.Scanner;
class IsStringPalindrome{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int l=0;
        int r=str.length()-1;
        str=str.toLowerCase();
        boolean isPalindrome=true;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(str.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(str.charAt(r))) r--;
            if(str.charAt(l)!=str.charAt(r)){
                isPalindrome=false;
                break;
            }
            l++;
            r--;
        }
        if(isPalindrome){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}