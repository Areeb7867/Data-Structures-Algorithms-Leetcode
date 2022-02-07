package com.abbasi;

import java.util.ArrayList;

public class retunarrList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,8} ;
        ArrayList<Integer> ans = addnum(arr ,4, 0, ArrayList<>());
        System.out.println(ans);

    }

    static ArrayList<Integer> list = new ArrayList<>() ;
    static void addnum(int[] arr , int target , int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target ){
            list.add(index) ;
        }
        return addnum(arr , target , index + 1 , list );

    }
}
