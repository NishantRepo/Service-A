package org.example.corejava;

import java.util.Arrays;

public class NEwDemo {

    public static void main(String[] args) {


//        Given an array of integers greater than zero, find if it is possible to split
//        it in two subarrays (without reordering the elements), such that the sum of the two subarrays is the same. Print the two subarrays.
//
//
//
//        Input : Arr[] = { 1 , 2 , 3 , 4 , 5 , 5  }
//
//        Output :  { 1 2 3 4 }
//
//        { 5 , 5 }

        int[] arr = { 1  , 2 , 3 , 4 , 5, 5 };
        int sum = Arrays.stream(arr).sum();
        int size = sum/2;
        int temp = 0;
        if( sum %2 == 0) {

            for(int i= 0; i< arr.length-1; i++) {
               temp = arr[i] + arr[i+1];
               if(temp  == size) {

               } else {

               }
            }
       }
    }
}
