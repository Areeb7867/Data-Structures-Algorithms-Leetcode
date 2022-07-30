class Solution {
     private static final int mod = 1_000_000_007;
    public int sumSubarrayMins(int[] arr) {
         Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] prevLesser = new int[n];
        int[] nextLesser = new int[n];
        
        // Filling the arrays with -1 and n
        Arrays.fill(prevLesser, -1);
        Arrays.fill(nextLesser, n);
        
        // Finding the next smaller index to the current element at i
        // If no next smaller exists, we have n
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                nextLesser[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        // Finding the previous smaller index to the current element at i
        // If no previous smaller exists, we have -1
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                prevLesser[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        // Finding number of lesser elements to left and right of a number and multiplying them to get the occurance of a number
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prevLesser[i];
            long right = nextLesser[i] - i;
            
            sum += (arr[i] * left * right) % mod;
        }
        
        return (int)(sum % mod);
    }
}