class Solution {
    int memo[] = new int[100];
    int countWays(int n) {
        // your code here
        if(n <= 2) return n;
        if(memo[n] != 0) return memo[n];
        memo[n] = countWays(n - 1) + countWays(n - 2);
        return memo[n];
    }
}
