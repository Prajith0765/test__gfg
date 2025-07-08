// User function Template for Java

class Solution {
    int[] memo = new int[100];
    public int nthFibonacci(int n) {
        // code here
        
        if(n <= 1){
            return n;
        }
        if(memo[n] != 0) return memo[n];
        memo[n] = nthFibonacci(n-1) + nthFibonacci(n-2);
        return memo[n];
    }
}