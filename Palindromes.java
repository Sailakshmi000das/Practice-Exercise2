import java.util.Scanner;

public class Palindromes {
        public static String palindrome(String s) {

            String reverse = new StringBuffer(s).reverse().toString();
            return reverse;
        }
        public static void main (String[] args)
                throws java.lang.Exception
        {
            System.out.println("Enter a string");

            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();

            if (s.equals(palindrome(s))) {
                System.out.println(s + " is a palindrome");
            } else {
                System.out.println(s + " is not a palindrome");
            }
        }
    }


