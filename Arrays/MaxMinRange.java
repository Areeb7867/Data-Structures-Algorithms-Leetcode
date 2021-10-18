public class MaxMinInRangeArr {
    public static void main(String[] args){
        int[] arr = { 1, 3, 7, 9, 14};
        System.out.println(maxR(arr , 1 ,3));


    }

    static int maxR(int[] arr , int start , int end ){
        int maxV= arr[start];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxV){
                maxV = arr[i];
            }

        }
        return maxV ;

    }
