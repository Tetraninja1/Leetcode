class Solution {
    public int[] findDegrees(int[][] matrix) {
        int x=matrix.length;
        int[] arr = new int[x];
        for(int i=0;i<x;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==1){
                    arr[j]++;
                }
            }
        }return arr;
    }
}
