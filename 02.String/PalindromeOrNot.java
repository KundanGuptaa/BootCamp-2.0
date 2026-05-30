import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(str2)){
            System.out.println("Palindrome.");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
