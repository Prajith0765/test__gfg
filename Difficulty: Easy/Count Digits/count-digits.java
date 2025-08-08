// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int c = 0;
        int t = n;
        while(t > 0){
            int r = t % 10;
            if(r != 0 && n % r == 0){
                c++;
            }
            t = t / 10;   
        }
        
        return c;
    }
}