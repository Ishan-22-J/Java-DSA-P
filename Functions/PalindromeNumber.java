package functions;

public class PalindromeNumber {


    static int reverse(int n){

        int rev =0;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10+lastdigit;
            n/=10;
        }
        return rev;

    }
    static boolean palindrome(int n){
        int original = n;
        int rev = reverse(n);
       return original == rev;
    }

    public static void main(String args[]){
        if (palindrome(121)) {
            System.out.println("yess it's Palindrome");
        }else {
            System.out.println("no it's not Palindrome");

        }
    }
}
