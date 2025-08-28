class Solution {
    public int findPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plateform = 1;
        int maxplateform = 1; 
        int i = 1;
        int j = 0;
        int n = arr.length;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                plateform++;
                i++;
            } else {
                plateform--;
                j++;
            }
            
            maxplateform = Math.max(maxplateform, plateform);
        }
        
        return maxplateform;
    }
}
