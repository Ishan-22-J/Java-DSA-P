package functions;

public class MultiplicationTable {
    static void table(int n){
        for(int i = 1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
    public static void main(String[]args){
        table(5);
    }

}
