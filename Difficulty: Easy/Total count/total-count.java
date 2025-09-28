// User function Template for Java

class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int total = 0;
        for(int num : arr){
            if(num == 0) continue;
            total += (num + k - 1) / k;
        }
        
        return total;
    }
}
