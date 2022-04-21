class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        int [][] dp = new int [l][l];
        int si = -1;
        int sj = -1;
        for(int diag=0; diag< l; diag++){
            for(int i=0, j= diag; j< l;i++, j++){
                if(diag == 0) //sunstring length is  1
                    dp[i][j] = 1;
                else if(diag == 1){//length of substring is 2
                    if(s.charAt(i) == s.charAt(j))
                        dp[i][j] = 1;
                }
                else{
                    if(s.charAt(i) == s.charAt(j))
                        dp[i][j] = dp[i+1][j-1];
                }
                if(dp[i][j] == 1){
                    si = i;
                    sj = j;
                }
            }
        }
        return s.substring(si,sj+1);
    }
}