class Solution {
    public int fun(String s1,String s2,int m,int n){
        if(m==0 || n==0)
            return 0;
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return fun(s1,s2,m-1,n-1) + 1;
        else
            return Math.max(fun(s1,s2,m-1,n),fun(s1,s2,m,n-1));
    }
    public int memo(String s1,String s2,int m,int n,int[][]mem){
        if(m==-1 || n==-1)
            return 0;
        
        if( mem[m][n] != 0)
            return mem[m][n];
        
        if(s1.charAt(m) == s2.charAt(n))
            return mem[m][n] = memo(s1,s2,m-1,n-1,mem) + 1;
        else
            return mem[m][n] = Math.max(memo(s1,s2,m-1,n,mem),memo(s1,s2,m,n-1,mem));
    }
    
    public int tab(String s1,String s2,int m,int n){
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i ==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] mem = new int[m][n];
        return tab(text1,text2,m,n);
        //return memo(text1,text2,m-1,n-1,mem);
        //return fun(text1,text2,m,n);
    }
}