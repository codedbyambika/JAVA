import java.util.Scanner;
class SecondWordInUpper{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str= sc.nextLine();
        String[] w=str.split(" ");
        if(w.length<2){
            System.out.println("NO second word");
        }
        else{
            System.out.println(w[1].toUpperCase());
        }
        sc.close();
    }
}