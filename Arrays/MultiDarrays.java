package com.company;

import java.util.Scanner;

public class multidimensionalarray {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[][] arr = new int[3][3];
       System.out.println(arr.length); //number of rows


       for (int row = 0; row < arr.length; row++) {
           //for every column in every row
           for (int col = 0; col < arr[row].length ; col++) {
               arr[row][col]= sc.nextInt();
           }

       }
/*
output with same fucntions
 */
       for (int row = 0; row < arr.length; row++) {
           //for every column in every row
           for (int col = 0; col < arr[row].length ; col++) {
               System.out.print(arr[row][col]+" ");
           }
           System.out.println(" ");


       }
    }
}
