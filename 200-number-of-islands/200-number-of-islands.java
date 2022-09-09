class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for(int i = 0; i< m; i++){
            for(int j=0; j< n; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid,visited,i,j);
                    ans = ans+ 1;
                }
            }
        }
        return ans;
    }
    
    public static void dfs(char[][] grid, boolean[][] visited,int i,int j){
        
        int m = grid.length;
        int n = grid[0].length;
        visited[i][j] = true;
        int[][] direc = {{0,1},{1,0},{0,-1},{-1,0}};
        
        for(int[] dir : direc){
            int x = i + dir[0];
            int y = j + dir[1];
            
            if(x< m && y < n && x > -1 && y >-1 && grid[x][y] == '1' && !visited[x][y]){
                dfs(grid,visited,x,y);
            }
        }
    }
}