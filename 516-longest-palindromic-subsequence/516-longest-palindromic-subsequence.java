class Solution {
    public int fun(int i,int l,String s){
        if(i > l)
            return 0;
        if(i == l)
            return 1;
        
        if(s.charAt(i) == s.charAt(l))
            return fun(i+1,l-1,s) + 2;
        else
            return Math.max(fun(i+1,l,s),fun(i,l-1,s));
    }
    public int tab(String s){
        int n = s.length();
        int[][] dp = new int[n][n];
        
        for(int dia=0; dia< n; dia++){
            for(int i=0, j=dia; j<n; i++,j++){
                if(dia == 0){
                    dp[i][j] = 1;
                }
                else if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
    public int longestPalindromeSubseq(String s) {
        int l= s.length();
        return tab(s);
        //return fun(0,l-1,s);
    }
}