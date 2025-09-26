/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int i = 0;
        int j = 0;
       while(i < a.length && j < b.length){
            if(a[i] != b[j]){
                return i;
            }
            i++;
            j++;
            
        }
        
        return a.length - 1;
    }
}