class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int [] res=new int [m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    res[i]++;
                }
            }           
        }
        int [] ans=new int[k];
        int p=0;
        int val=0;
        while(k>0){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<res.length;i++){
            if(res[i]<min){
                min=res[i];
                ans[p]=i;
                val=ans[p];
            }
            }
            res[val]=Integer.MAX_VALUE;
            p++;
            k--;
    }
    return ans;
    }
}