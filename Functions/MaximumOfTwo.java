package functions;

public class MaximumOfTwo {

    static int maximum(int a , int b){

        if(a>b){
           return a;
        }else {
            return b;
        }

        /* if we want we can reduce the code
        return Math.max(a, b);
        by using this
         */

    }
    public static void main(String[]args){
        System.out.println(maximum(4,5));

    }
}
