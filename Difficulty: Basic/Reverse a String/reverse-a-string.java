// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] c = s.toCharArray();
        
        int left = 0;
        int right = c.length - 1;
        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        
        return new String(c);
    }
}