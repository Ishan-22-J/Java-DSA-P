package array;

public class EvenOddCount {

    static void evenodd(int num[]) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {

                even++;
            } else
                odd++;

        }
        System.out.println("odd="+odd);
        System.out.println("even="+even);
    }

    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        evenodd(num);


    }
}
