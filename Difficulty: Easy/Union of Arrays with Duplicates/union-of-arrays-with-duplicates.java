class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int n : a){
            set.add(n);
        }
        
        for(int n : b){
            set.add(n);
        }
        
        return new ArrayList<>(set);
    }
}