public class MaxMinElementArray {
    public static void main(String[] args){
         int[] arr = { 1, 3, 7, 9, 14};
        System.out.println(max(arr));
    }
    //considering array is non empty
    static int max(int[] arr ){
        int maxVal = arr[0] ;      //assume max item is at index zero
        for (int i = 1; i < arr.length; i++) { // int i =1  just to compare it from the index 1
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal ;
    }
}
