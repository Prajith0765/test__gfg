class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[n];
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0 && arr[i] <= n){
                freq[arr[i] - 1]++;
            }
            
        }
        
        for(int i = 0; i < freq.length; i++){
            ans.add(freq[i]);
        }
        
        return ans;
        
    }
}
