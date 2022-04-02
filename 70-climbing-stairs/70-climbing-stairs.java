class Solution {
    public int climbStairs(int n) {
        int []a = new int[n+1];
        
        a[0] = 1;
        int ans;
        for(int i=1; i<= n; i++){
            ans = 0;
            ans += a[i-1];
            if(i-2 >= 0)
                ans += a[i-2];
            /*if(i-3 >= 0)
                ans += a[i-3];*/
            a[i] = ans;
        }
        return a[n];
    }
}