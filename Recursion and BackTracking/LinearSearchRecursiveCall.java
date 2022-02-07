package com.abbasi;

public class linearrecc {
    public static void main(String[] args) {
        int[] arr = {1 ,2,3,4,5,6,7,8};
        System.out.println(linearsr(arr , 0 ,5));
        System.out.println(indexlinear(arr ,0 ,5 ));

    }
    static boolean linearsr(int[] arr , int index , int target){
        if(index == target){
            return  false ;
        }
        if(arr[index] == target){
            return true ;
        }
        else {
            return linearsr(arr , index + 1 , target);
        }
    }
    static int indexlinear(int[] arr , int index , int target){
        if(target == index){
            return -1 ;
        }
        if(arr[index] == target){
            return index ;
        }
        else {
            return indexlinear(arr,0,5);
        }
    }
}
