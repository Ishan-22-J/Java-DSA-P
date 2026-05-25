package array;

public class SecondLargest {




    static int secondLargest(int num[]){

        int largest = num[0];
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++) {
            if (largest < num[i]) {
                secondlargest = largest;
                largest = num[i];
            }else if(num[i] > secondlargest && num[i] != largest){

                secondlargest = num[i];
            }
        }
       return secondlargest;
    }




    public static void main(String args[]){
        int num []={1,2,3,4,5};

        System.out.println("secondlargest="+secondLargest(num));
    }
}

