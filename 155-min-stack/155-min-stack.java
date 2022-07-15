class MinStack {
      Stack<Integer> stack = new Stack();
      Stack<Integer> mValues = new Stack();
    
    
    public void push(int val) {
        if(mValues.isEmpty() || val <= mValues.peek()){
            mValues.push(val);
        }
        stack.push(val);
        
    }
    
    public void pop() {
        if(stack.peek().equals(mValues.peek())){
            mValues.pop();
        }
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek() ; //regular stack top default java .peek
        
    }
    
    public int getMin() {
        return mValues.peek(); // top of stack of minimum latest value updated
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */