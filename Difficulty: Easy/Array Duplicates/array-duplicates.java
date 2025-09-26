class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1 ){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}