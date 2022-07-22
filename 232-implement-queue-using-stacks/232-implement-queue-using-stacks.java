class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    //consdiering two stacks for input and output
    

    public MyQueue() {
        
    }
    
    public void push(int x) {
        //if the input stack is not empty
        //then top elemnt of input is pushed to output and popped from input
        while(input.empty()== false){
            output.push(input.peek());
            input.pop();
        }
        input.push(x);
         while(output.empty()== false){
            input.push(output.peek());
            output.pop();
        }
    }
    
    public int pop() {
        
        int val = input.peek();
        input.pop();
        return val;
        
    }
    
    public int peek() {
         return input.peek();
        
    }
    
    public boolean empty() {
        return input.empty() && output.empty();
        
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */