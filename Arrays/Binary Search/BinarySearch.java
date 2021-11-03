package com.abbasi;

public class Main {

    public static void main(String[] args) {
	 int[] nums = {-1, 1, 2,3,4,5,6,7,8,99,9999,212322};
     int target = -1 ;
     int ans = binarysearch(nums , target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr , int target){
        // find the middle element
        // int mid = (start + end) / 2; this might return a value that might out of bound fot Int
        // so mid can be taken as  mid = start + (end - start)/2
        int start = 0;
        int end = arr.length ;

        while(start <= end){
            int mid = start + (end-start)/2 ;

            if( target < arr[mid]){
                end = mid -1 ;
            }
            else if(target > arr[mid]){
                start = mid +1 ;
            }
            else{ // found at the middle element
                return  mid ;
            }

        }
        return -1 ;
    }
}
