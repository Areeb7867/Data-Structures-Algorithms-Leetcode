package com.abbasi;

import java.util.ArrayList;

public class arraylistz {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,8} ;
        addnum(arr , 4, 0);
        Sstatic ArrayList<Integer> list = new ArrayList<>() ;
        static void addnum(int[] arr , int target , int index){
            if(index == arr.length){
                return;
            }
            if(arr[index] == target ){
                list.add(index) ;
            }
            addnum(arr , target , index + 1 );

        }ystem.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>() ;
    static void addnum(int[] arr , int target , int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target ){
            list.add(index) ;
        }
        addnum(arr , target , index + 1 );

    }
}
