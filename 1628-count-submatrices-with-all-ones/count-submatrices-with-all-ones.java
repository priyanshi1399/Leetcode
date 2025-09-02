class Solution {
    public int countNumberOfOnes(int [] mask){
        int consecutiveOne=0;
        int subCount=0;
        for(int i=0;i<mask.length;i++){

            if(mask[i]==1){
                consecutiveOne++;
            }
            else{
                consecutiveOne=0;
            }
            subCount+=consecutiveOne;
        }
        return subCount;
    }
    public int numSubmat(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int result=0;
        for(int topRow=0;topRow<m;topRow++){
            int [] mask=new int[n]; //take mask and then fill 1

            Arrays.fill(mask,1);

            for(int bottomRow=topRow;bottomRow<m;bottomRow++){

                for(int col=0;col<n;col++){

                    mask[col]=mat[bottomRow][col] & mask[col]; //to calculate for every other row 
                }

                result+=countNumberOfOnes(mask);
            }

        }
        return result;
    }
}