package com.abbasi.merz;

import java.util.Arrays;

public class quickz {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quicksort(nums, 0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        //Arrays.sort(nums); // aggresive output lmao for me atleast

    }
    static void quicksort(int[] arr , int low , int high){
        if(low >= high){
            return ;
        }
        int start = low ;
        int end = high ;
        int mid = start + ( end - start )/2 ;
        int pivot = arr[mid] ;

        while (start  <= end){
            while(arr[start] < pivot){
                start ++ ;
            }
            while(arr[end]> pivot ){
                end -- ;
            }
            if(start <= end){ // this check swaps the elements of the array on pivot reference
                int temp = arr[start] ;
                arr[start] = arr[end] ;
                arr[end] = temp ;
                start ++ ;
                end -- ;
            }
        }
        quicksort(arr ,low , end);
        quicksort(arr ,start , high);

    }
}
