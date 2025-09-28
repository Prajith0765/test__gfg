class Solution {
    public static String encode(String s) {
        // code here
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) == s.charAt(i)){
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length() - 1));
        sb.append(count);
        
        return sb.toString();
    }
}