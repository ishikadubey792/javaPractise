class Solution {
    public int numSpecial(int[][] mat) {
        if(mat.length == 0){
            return 0;
        }

        int[] rowArr = new int[mat.length];
        int[] colArr = new int[mat[0].length];

        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    rowArr[i] += 1 ;
                    colArr[j] += 1;
                }
            }
        }
 
            int count = 0;
         for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1 && (rowArr[i] == 1 && colArr[j] == 1)){
                     count++;
                }
            }
        }
        return count;
    }
}