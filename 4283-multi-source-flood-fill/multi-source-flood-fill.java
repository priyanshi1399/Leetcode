class Solution {
    private final int [][] directions={{-1,0},{1,0},{0,1},{0,-1}};
    public int[][] colorGrid(int n, int m, int[][] sources) {
        List<int []> q=new ArrayList<>(); // taking LinkedList can be create overhead in removing
        for(int [] s: sources){
            q.add(new int [] {s[0],s[1],s[2]});
        }

    //sort it in descending so that max comes first
    
    q.sort((a,b)->Integer.compare(b[2],a[2]));

    int [][] ans=new int[n][m];

    //row 0->col0,col1,col2
    //row-1 col0,col1,col2

    for(int [] row: q){
        ans[row[0]][row[1]]=row[2]; // 0,0,1 -> converted and filled 0th row 0th col-> 1 [1,0,0]
    }

    for(int i=0;i<q.size();i++){
        //getting the element
        int [] curr=q.get(i);
        int first=curr[0],second=curr[1],third=curr[2];

        for(int [] dir: directions){

            int x=first+dir[0];
            int y=second+dir[1];

            if(x>=0 && y>=0 && x<n && y<m && ans[x][y]==0){
                ans[x][y]=third;
                q.add(new int [] {x,y,third});
            }
        }
    }
    return ans;


    }
}