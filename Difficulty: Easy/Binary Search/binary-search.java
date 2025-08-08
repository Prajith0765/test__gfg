class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int first = 0;
        int last = arr.length - 1;
        int result = -1;
        
        while(first <= last){
            int mid = first + (last - first) / 2;
            
            if(arr[mid] < k){
                first = mid + 1;
            } 
            else if(arr[mid] > k){
                last = mid - 1;
            } 
            else {
                result = mid;
                last = mid - 1;
            }
        }

        return result;
    }
}