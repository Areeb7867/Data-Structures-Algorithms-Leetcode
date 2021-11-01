package com.abbasi;

public class findevendigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896} ;

        System.out.println(findNumber(nums));

    }
    static int findNumber(int[] nums){    //to iterate num over array nums and get value from method even
        int count = 0 ;
        for(int num : nums){
            if(even(num)){
                count++ ;
            }
        }
        return count;

    }
    static boolean even(int num){    
            int digitN  = digits(num);   // check if the number of digits are even by %2 and pass them to findNumber method
            if(digitN % 2 == 0){
                return true ;
            }
            return false ;
    }

    static int digits(int num){  // checking value of num for num > 0 can also add nums for negative and zero cases with return 1 on zero and num *-1 on negative
        int count= 0;
        while(num>0){
            count++ ;
            num = num/10 ;
        }
        return count ;
    }


}
