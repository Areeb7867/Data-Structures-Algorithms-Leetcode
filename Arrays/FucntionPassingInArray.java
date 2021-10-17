package com.company;

import java.util.Arrays;
//functions to pass values in array that is showing mutability
public class passinginfucnarr {
    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] arr){
        arr[2] = 99;
    }

}
