class Solution {
    public int lengthOfLongestSubstring(String s) {
             int len = s.length() ;
            if(len == 0) return 0 ;
            char ch = s.charAt(0);
            String ans = " ";
            ans = ans + ch ;
            int max = 1 ;
            
            for(int i = 0 ; i <len ; i++){
                    ch=s.charAt(i);
            int index=ans.indexOf(ch);
            if(index == -1){
                ans=ans+ch;
                max=Math.max(max,ans.length());
            }
            else{
                ans=ans.substring(index+1)+ch;     
            }
            }
            return  max ;
            
            
        
    }
}