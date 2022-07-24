/*class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack  = new Stack<>() ; //storing characters in the stack
        String str1 = " ";
        String str2 = " ";
        //traverse string and search for the #
        
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '#' && !stack.isEmpty()){ //is char is # and stack isnt empty pop latest elemnt
                stack.pop();
                
            }
            else if(ch!= '#'){ // if not #  we push element in the array
                stack.push(s.charAt(i));
            }
            
            //  String str1 =" ";
            while(!stack.isEmpty());
            str1+= stack.pop();
        }
        
        for(int i = 0 ; i <t.length() ; i++){
            char ch = t.charAt(i);
            if(ch=='#' && !stack.isEmpty()){
                stack.pop();
            }
            else if(ch != '#'){
                stack.push(t.charAt(i));
            } 
            // String str2 =" ";
            while(!stack.isEmpty());
            str2+= stack.pop();
            
        }
        
        
        return (str1.equals(str2)) ;
        //for the both strings are equal
    }
} */
// the above code shows TLE although its correct for the logic

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Stacksol(s).equals(Stacksol(t));
    }
        
        private String Stacksol(String str){
            Stack<Character> stack  = new Stack<Character>();
            
            for(char c :str.toCharArray()){ // for every char in string
                if(c!= '#'){
                    stack.push(c);
                }
                else if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            return stack.toString();
            
        }
        
    
}