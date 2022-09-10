class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        //boolean[][] visited = new boolean[m][n];
        int[][] direc = {{0,1},{1,0},{-1,0},{0,-1}};
        int peri = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    int c=0;
                    for(int[] dir : direc){
                        int x = i + dir[0];
                        int y = j + dir[1];
                        
                        if(x<m && x>-1 && y<n && y>-1 &&grid[x][y]==1){
                            c+=1;
                        }
                    }
                    peri = peri + 4 - c;
                }
            }
        }
        return peri;
    }
}