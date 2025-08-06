class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();

    public boolean solve(int [] stones,int currStone_index,int prev_jump,int [][] dp){
        if(currStone_index  == stones.length-1){
            return true;
        }
        if(dp[currStone_index][prev_jump]!=-1){
            return dp[currStone_index][prev_jump]==1;
        }
        boolean res=false;
        for(int next_jump=prev_jump-1;next_jump<=prev_jump+1;next_jump++){
                if(next_jump>0){
                    int nextStone = stones[currStone_index] + next_jump;
                    if(map.containsKey(nextStone)){
                        res=res | solve(stones,map.get(nextStone),next_jump,dp); //index to be sent
                    }
                }
        }
        dp[currStone_index][prev_jump]=res?1:0;
        return res;
    }
    public boolean canCross(int[] stones) {
        int n=stones.length;
        int [][] dp=new int[n+1][n+1];
        if(stones[1]!=1){
            return false;
        }
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        
        for(int i=0;i<n;i++){
            map.put(stones[i],i);
        }

        return solve(stones,0,0,dp);

        
    }
}


