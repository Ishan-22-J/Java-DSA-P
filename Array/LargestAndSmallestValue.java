package array;


public class LargestAndSmallestValue {
    static int largest(int num[]){
       // we also use this int largest = Integer.MIN_VALUE;

         int largest = num[0];

        for(int i=0;i<num.length;i++){
            if (largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    static int smallest(int num[]){
       // we also use this int smallest = Integer.MAX_VALUE;
         int smallest = num[0];

        for(int i=0;i<num.length;i++){
            if (smallest > num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }




    public static void main(String args[]){
        int num []={1,2,3,4,5};
        System.out.println("largest="+largest(num));
        System.out.println("smallest="+smallest(num));
    }
}
