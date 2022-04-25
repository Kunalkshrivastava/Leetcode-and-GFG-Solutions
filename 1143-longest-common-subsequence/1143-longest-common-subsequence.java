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
        if(m==0 || n==0)
            return 0;
        
        if( mem[m][n] != 0)
            return mem[m][n];
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return mem[m][n] = memo(s1,s2,m-1,n-1,mem) + 1;
        else
            return mem[m][n] = Math.max(memo(s1,s2,m-1,n,mem),memo(s1,s2,m,n-1,mem));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] mem = new int[m+1][n+1];
        return memo(text1,text2,m,n,mem);
        //return fun(text1,text2,m,n);
    }
}