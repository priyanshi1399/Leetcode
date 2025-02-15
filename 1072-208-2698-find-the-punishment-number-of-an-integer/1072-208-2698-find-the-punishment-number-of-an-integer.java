class Solution {
    public boolean checkPunishmentNumber(int index,int currSum,String s,int num,int [][] dp){

        if(index==s.length()){
            return currSum==num;
        }
        if(currSum>num){
            return false;
        }
        if(dp[index][currSum]!=-1){
            return dp[index][currSum]==1;
        }
        boolean possible=false;
        for(int j=index;j<s.length();j++){
            String subPart=s.substring(index,j+1);
            int convertInt=Integer.parseInt(subPart);
            if(checkPunishmentNumber(j+1,currSum+convertInt,s,num,dp)){
                possible=true;
            }
        
        }
            dp[index][currSum]=possible?1:0;
                return possible;
            }
    
    public int punishmentNumber(int n) {
        int sum=0;
        for(int num=1;num<=n;num++){
            int sq=num*num;
            String s=Integer.toString(sq);
            int [][] dp=new int[s.length()][num+1];
            for(int [] row :dp){
            Arrays.fill(row,-1);
        }
            if(checkPunishmentNumber(0,0,s,num,dp)){
                sum+=sq;
            }
        }
        return sum;
    }    
}