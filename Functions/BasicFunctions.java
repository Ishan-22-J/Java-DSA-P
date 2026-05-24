package functions;



public class BasicFunctions {

    static int add(int a,int b){
        return a+b;
    }

    static int square(int n){
        return n*n;
    }

    static boolean isEven(int n){
        return n%2==0;
    }

    public static void main(String[] args){

        System.out.println(add(4,6));
        System.out.println(square(5));
        System.out.println(isEven(8));

    }
}