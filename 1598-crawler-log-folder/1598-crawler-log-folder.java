class Solution {
    public int minOperations(String[] logs) {
        int n=logs.length;        
        int count=0;
        for(int i=0;i<n;i++){
            if(logs[i].equals("../")){
                if(count<=0){
                    count=0;
                }
                else{
                count--;
                }
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
}