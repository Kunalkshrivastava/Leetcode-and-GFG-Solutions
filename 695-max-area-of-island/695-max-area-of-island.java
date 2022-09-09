class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans= 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i< m; i++){
            for(int j=0; j<n ; j++){
                if(!visited[i][j] && grid[i][j] == 1){
                    ans = Math.max(ans,dfs(grid,visited,i,j));
                }
            }
        }
        return ans;
    }
    public static int dfs(int[][] grid, boolean[][] visited,int i,int j){
        
        int m = grid.length;
        int n = grid[0].length;
        visited[i][j] = true;
        int[][] direc = {{0,1},{1,0},{0,-1},{-1,0}};
        int size = 0;
        for(int[] dir : direc){
            int x = i + dir[0];
            int y = j + dir[1];
            
            if(x< m && y < n && x > -1 && y >-1 && grid[x][y] == 1 && !visited[x][y]){
                size = size + dfs(grid,visited,x,y);
            }
        }
        return size + 1;
    }
}