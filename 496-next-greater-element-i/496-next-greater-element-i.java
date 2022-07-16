class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        
        int[] result = new int[nums1.length];
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        
            for(int i=nums2.length-1;i>=0;i--){
//             if stack is empty
            if(s.size()==0){
                hashmap.put(nums2[i],-1);
            }
//             this condition will get the greatest right element
            else if(s.size()>0 && s.peek()>nums2[i]){
                hashmap.put(nums2[i],s.peek());
            }
//             when the element at the top is lesser than the current element
            else if(s.size()>0 && s.peek()<nums2[i]){
                
                 while(s.size()>0 && s.peek()<nums2[i]){
                     s.pop();
                 }
//                 checks due to which condition while loop is terminated
                if(s.size()==0){
                    hashmap.put(nums2[i],-1);
                }else{
                     hashmap.put(nums2[i],s.peek());
                }
            }
            s.push(nums2[i]);
        }
        
        for(int j=0;j<nums1.length;j++){
            if(hashmap.containsKey(nums1[j])){
                result[j]=hashmap.get(nums1[j]);
            }
        }
        return result;
        
    }
}