import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        if(new StringBuilder(s).reverse().toString().equalsIgnoreCase(s)){
            System.out.println(s +" is a Palindrome");
        }else{
            System.out.println(s +" is not a Palindrome");
        }

    }

}
