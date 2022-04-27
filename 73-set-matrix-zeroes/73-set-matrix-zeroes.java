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
        /*
        boolean col1 = false;
        
        for(int i=0; i< matrix.length; i++){
                if(matrix[i][0] ==0) col1 =true;
            for(int j= 1; j< matrix[0].length ; j++){
                
                if(matrix[i][j] == 0){
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        for(int i= m-1; i>=0; i--){
            for(int j= n-1; j>=1 ; j--){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
                if(col1 == true)
                    matrix[i][0] = 0;
            }
        }*/

    }
}