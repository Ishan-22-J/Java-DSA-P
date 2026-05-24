package functions;

public class ReverseNumber {

   static int reverse(int n){


    int rev =0;
    while(n>0){
        int lastdigit = n%10;
        rev = rev*10+lastdigit;
        n/=10;
    }
    return rev;

}
public static void main(String agrs[]){
    System.out.println(reverse(12345));}
}
