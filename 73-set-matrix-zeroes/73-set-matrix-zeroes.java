class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] col = new int[m];
        int[] row = new int[n];
        
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    col[i] = 1;
                    row[j] = 1;
                }
                if(col[i] == 1 || row[j] == 1)
                    matrix[i][j] = 0;
            }
        }
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length ; j++){
                if(col[i] == 1 || row[j] == 1)
                    matrix[i][j] = 0;
            }
        }

    }
}