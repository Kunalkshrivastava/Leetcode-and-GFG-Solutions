class Solution {
    public int countSubstrings(String s) {
        int l= s.length();
        int[][] dp = new int[l][l];
        int ans = 0;
        
        for(int dia =0; dia<l; dia++){
            for(int i=0,j = dia; j<l; i++,j++){
                if(dia == 0){
                    dp[i][j] = 1;
                    ans++;
                }
                else if(dia == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = 1;
                        ans++;
                    }
                }
                else{
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = dp[i+1][j-1];
                        if(dp[i][j] == 1)
                            ans++;
                    }
                }
            }
        }
        return ans;
    }
}