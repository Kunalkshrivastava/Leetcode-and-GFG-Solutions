class Solution {
    public int fun(String s1, String s2, int m,int n){
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return fun(s1,s2,m-1,n-1);
        
        int ins = fun(s1,s2,m,n-1);
        int del = fun(s1,s2,m-1,n);
        int repl = fun(s1,s2,m-1,n-1);
        
        return Math.min(ins,Math.min(del,repl))+ 1;
    }
    public int memo(String s1, String s2, int m,int n,int[][]mem){
        if(m == 0 ||n== 0){
            return mem[m][n] = (m>n)?m :n;
        }
        if(mem[m][n] != 0){
            return mem[m][n];
        }
        
        if(s1.charAt(m-1) == s2.charAt(n-1))
            return mem[m][n] = memo(s1,s2,m-1,n-1,mem);
        
        int ins = memo(s1,s2,m,n-1,mem);
        int del = memo(s1,s2,m-1,n,mem);
        int repl = memo(s1,s2,m-1,n-1,mem);
        
        return mem[m][n] = Math.min(ins,Math.min(del,repl))+ 1;
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] mem = new int[m+1][n+1];
        return memo(word1,word2,m,n,mem);
        //return fun(word1,word2,m,n);
    }
}