package array;

import java.util.Arrays;

public class BinarySearch {
    static void binary(int num[]){
        int start =0;
        int end = num.length-1;

        int key =5;


        while (start<=end){
            int middle = (start+end)/2;

            if (num[middle]==key){
                System.out.println("Found at index:-"+middle);
                return ;
            } else if (key>num[middle]) {
                start=middle+1;
            }else if (key<num[middle]){
                end=middle-1;
            }


        }
        System.out.println("Not found ");



    }

    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7,8,9};
        binary(num);





    }

}

