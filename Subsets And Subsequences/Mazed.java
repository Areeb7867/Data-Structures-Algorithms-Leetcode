package com.abbasi.mazeprob;

public class mazed {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    static int count(int row , int col){
        if(row == 1 || col == 1){
            return 1 ;
        }
        int left = count(row -1 , col);
        int right = count(col -1 , row) ;
        return left + right ;
    }
}
