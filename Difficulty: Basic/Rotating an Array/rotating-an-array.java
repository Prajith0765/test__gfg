// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n; // In case d > n
        int gcd = GCD(d, n);

        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            int j = i;

            while (true) {
                int k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;

                arr[j] = arr[k];
                j = k;
            }

            arr[j] = temp;
        }
    }
    
    int GCD(int a, int b){
        if(b == 0) return a;
        
        return GCD(b , a % b);
    }
}
