package org.example.corejava;

public class CodeDemo {

    public static void main(String[] args) {
//        You are given an array people where people[i] is the weight of the ith person,
//        and an infinite number of boats where each boat can carry a maximum weight of limit.
//        Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
//
//        Return the minimum number of boats to carry every given person.
//
//                Input: people = [3,2,2,1], limit = 3
//
//        Output: 3
//
//        Explanation: 3 boats (1, 2), (2) and (3)
      //  int[] arr = {3,2,2,1};
        int[] arr = {1,2,2,3};
        int[] newArr = new int[arr.length];
        int limit = 3;
        int init = 0;
        int count = 0;
        for(int i=0; i< arr.length; i++) {
           int result =  arr[i] + init;
           if(result == limit) {
               count++;
               init = 0;
           } else if(result > limit){
               count++;
//               init = arr[i];
//               init = 0;
           } else {

               init = arr[i];
           }
        }
        System.out.println(count);



    }
}
