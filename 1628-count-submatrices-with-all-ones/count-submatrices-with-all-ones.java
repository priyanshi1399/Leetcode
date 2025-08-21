class Solution {
    public int OnesSubarrayCount(int [] row){
        int consecutiveOnes=0;
        int subCount=0;
        for( int val:row){
            if(val==0){
                consecutiveOnes=0;
            }
            else{
                consecutiveOnes++;
            }
            subCount+=consecutiveOnes;
        }
        return subCount;
    }
    public int numSubmat(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        int totalCount=0;
        for(int topRow=0;topRow<m;topRow++){
            int [] maskRow=new int[n]; //make maskRow for every row // 1 1 1 

            Arrays.fill(maskRow,1);

            for(int bottomRow=topRow;bottomRow<m;bottomRow++){

                for(int col=0;col<n;col++){

                    maskRow[col]=maskRow[col] & mat[bottomRow][col]; //taking & with evry consecutive first initlizae mask with 111  earlier
                }

                totalCount+=OnesSubarrayCount(maskRow); //calculating for every row
            }
        }

        return totalCount;
    }
}