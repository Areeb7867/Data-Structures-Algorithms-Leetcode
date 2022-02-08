package com.abbasi;

public class rbs {
    public static void main(String[] args) {
           int[] nums = {0,1,2,4,5,7,8} ;
        System.out.println(search(nums,4, 0,0));
    }
    static int search(int[] arr , int target , int start , int end){
        if(start > end){
            return  -1 ;
        } //arrray is not sorted

        int mid = start + (end - start)/2 ;
        if(arr[mid] == target){
            return mid ;
        } //if middle is target

        if(arr[start]<= arr[mid]){ // left part is sorted of the array
            if(target >= arr[start] && target <= arr[mid]){
                return search(arr, target , start , mid -1 );
            }
        }

        else{  //right part of the array is sorted
            if(target >= arr[mid] && target <= arr[end]){
                return  search(arr, target, mid +1 , end);
            }
        }
        return search(arr,target , start , mid -1);


    }
}
