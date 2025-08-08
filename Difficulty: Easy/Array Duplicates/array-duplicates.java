class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            if(set.contains(a)){
                list.add(a);
            } else {
                set.add(a);
            }
        }
        
        return list;
    }
}