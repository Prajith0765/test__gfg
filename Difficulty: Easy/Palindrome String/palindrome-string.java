class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] arr = s.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            } else {
                return false;
            }
            
        }
        
        return true;
    }
}