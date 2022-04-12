class Solution {
    public int fun(int i,int j, int m,int n,int[][] grid, int[][] mem){
        if(i == m-1 && j == n-1){
            return mem[i][j] = grid[i][j];
        }
        if(mem[i][j] != 0)
            return mem[i][j];
        int ans = (int)(1e8);
        if(i+1 < m)
            ans = Math.min(ans,fun(i+1,j,m,n,grid,mem));
        if(j+1 < n)
            ans = Math.min(ans,fun(i,j+1,m,n,grid,mem));
        return mem[i][j]= ans + grid[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] mem = new int[m][n];
        return (fun(0,0,m,n,grid,mem));
    }
}