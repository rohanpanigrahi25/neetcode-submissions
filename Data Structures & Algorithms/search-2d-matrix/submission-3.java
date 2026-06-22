class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            int l=0;
            int r=matrix[i].length-1;
            if(target<matrix[i][l] && target>matrix[i][r]){
                continue;
            } else {
                while(r>=l){
                    int m = l+(r-l)/2;
                    if(matrix[i][m] == target){
                        return true;
                    } else if(target < matrix[i][m]){
                        r = m - 1;
                    } else{
                        l = m+1;
                    }
                }
            }
        }
        return false;
    }
}
