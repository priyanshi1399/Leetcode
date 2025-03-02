class Solution {
    
    public boolean isPalindrome(String s,int start,int end){
        if(s.length()==1){
            return true;
        }
        while(start<end){
           if(s.charAt(start)!=s.charAt(end)){
            return false;
            }
           start++;
           end--;
            }
        return true;
        }
    public void solve(int index, String s, List<List<String>> res,List<String> temp,int n ){
        if(index==n){
            res.add(new ArrayList<>(temp));
            return;
        }

    for(int i=index;i<n;i++){
        if(isPalindrome(s,index,i)){
            temp.add(s.substring(index,i+1));
            solve(i+1,s,res,temp,n);
            temp.remove(temp.size()-1);
        }
    }

        
    }
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        solve(0,s,res,temp,n);
        return res;
    }
}