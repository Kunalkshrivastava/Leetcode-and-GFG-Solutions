class Solution {
    public int tab(int m,int n,int[][] grid){
        int[][] tab = new int[m][n];
        for(int i=m-1; i>=0; i--){
            for(int j= n-1; j>=0; j--){
                if(i == m-1 && j == n-1){
                    tab[i][j] = grid[i][j];
                    continue;
                }
                int ans = (int)(1e8);
                
                if(i+1 < m)
                    ans = Math.min(ans,tab[i+1][j]);
                if(j+1 < n)
                    ans = Math.min(ans,tab[i][j+1]);
                
                tab[i][j] = ans + grid[i][j];
            }
        }
        return tab[0][0];
    }
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
        return tab(m,n,grid);
        //return (fun(0,0,m,n,grid,mem));
    }
}