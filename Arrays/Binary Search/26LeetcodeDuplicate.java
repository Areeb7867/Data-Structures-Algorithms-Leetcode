public class removeDuplLeetcode {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1};
        int ans = duplicate(nums);
        System.out.println(ans);
    }
    static int duplicate(int[] arr  ){
        if (arr.length == 0){
            return  0;
        }
        int i = 0 ;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                i++ ;
                arr[i] = arr[j];
            }

        }
        return i+1 ;
    }
}
