package functions;

public class StrongNumber {
    static boolean strong(int n){
        int original = n;
        int sum =0;

        while(n>0){
            int lastdigit = n%10;
            int fact = 1;
            for (int i = 1;i<=lastdigit;i++){
                fact *=i;
            }
            sum +=fact;
            n/=10;
        }

        /*
        we can also use
        int fact[] = {1,1,2,6,24,120,720,5040,40320,362880};
        sum += fact[lastDigit];
         */
        return original == sum;

    }
    public static void main(String args[]){
        if (strong(145)){
            System.out.println("yes it's strong no.");
        }else{
            System.out.println("no it's not strong no.");

        }
    }
}
