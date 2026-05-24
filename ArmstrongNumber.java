package functions;



public class ArmstrongNumber {
    static boolean armstrong(int n){
        int original = n;
        int temp = n;
        int sum= 0;
        int count = 0;


        while(temp>0){
            temp/=10;
            count++;
        }
        while(n>0){
            int lastdigit = n%10;
            sum+=(int)Math.pow(lastdigit,count);
            n/=10;

        }
        return original == sum;
    }

    public static void main(String args[]){
        if(armstrong(153)){
            System.out.println("Yes, Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
