// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[10];
        for(int n : nums){
            while(n > 0){
                int digit = n % 10;
                flag[digit] = true;
                n = n/10;
            }
        }
        
        for(int i = 0; i < 10; i++){
            if(flag[i]){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
        
    
    }
}