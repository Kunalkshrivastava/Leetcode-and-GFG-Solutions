class Solution {
    public static int tab(int n,int[] nums){
        int[] dp = new int[n];
        
        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                dp[i] = 0;
                continue;
            }
            int ans = (int)(1e8);
            int jumps = nums[i];
            for(int j=1; j<= jumps; j++){
                if(i+j < n){
                    ans = Math.min(ans,dp[i+j]);
                }
                else{
                    break;
                }
            }
            dp[i] = ans+1;
        }
        return dp[0];
    }
    public static int fun(int n,int i, int[]nums, int[] mem){
        if(i == n-1){
            return mem[i] = 0;
        }
        if(mem[i] != 0)
            return mem[i];
        
        int ans = (int)(1e8);
        int jump = nums[i];
        
        for(int j=1; j<= jump; j++){
            if(i+j < n){
                ans = Math.min(ans,fun(n,i+j,nums,mem));
            }
            else{
                break;
            }
        }
        return mem[i] = ans+1;
    }
    
    public int jump(int[] nums) {
        int n = nums.length;
        int[] mem = new int[n];
        return tab(n,nums);
        //return fun(n,0,nums,mem);  
    }
}