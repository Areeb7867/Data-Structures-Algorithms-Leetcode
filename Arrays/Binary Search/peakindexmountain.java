class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1 ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]< arr[mid+1]){
             start = mid + 1 ;
                
            }
            else{
                end = mid -1 ;
            }
            
        }
        return start ;
    }
}

//brute force approach
/*
int ans=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
                index = i;
            }
        }
        return index;
        
        */
