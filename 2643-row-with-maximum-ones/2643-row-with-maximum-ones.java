class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int count=0;
        int [] res=new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    res[i]++;
                }
            }
        }
        int [] ans=new int[2];
        int max=0;
        for(int i=0;i<res.length;i++){
            if(res[i]>max){
                max=res[i];
                ans[0]=i;
                ans[1]=res[i];
            }
        }
    return ans;
          
        }
    }
