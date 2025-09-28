// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            boolean flag = false;
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                res.add(a[i]);
            }
        }
        
        return res;
    }
}
