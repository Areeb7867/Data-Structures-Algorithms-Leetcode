public class CeilingOFaNumber {
    public static void main(String[] args) {
        int[] nums = { 2,3,4,9,15,16,19,22};
        int target = 17 ;
        int ans = bsc(nums, target);
        System.out.println(ans);

    }
    static int bsc(int[] arr , int target){


        if(target > arr[arr.length-1]){
            return -1 ;
        }

        int start = 0 ;
        int end = arr.length-1 ;


        while(start <= end) {

            int mid = start + (end - start)/2 ;

            if(target > arr[mid]){
                start = mid + 1  ;
            }
            else if(target< arr[mid]){
                end = mid -1 ;
            }
            else{
                return mid;
            }

        }
        return start; // return end for floor of the number in the array.
    }
}
