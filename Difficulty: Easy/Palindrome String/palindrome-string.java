class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; 
    }
}