// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
            }
        }
        int count = 0; 
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length)
            arr[count++] = 0;
        
        for(int i : arr){
            list.add(i);
        }
        return list;
    
    }
}
