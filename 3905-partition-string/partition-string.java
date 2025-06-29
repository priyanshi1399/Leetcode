class Solution {
    public List<String> partitionString(String s) {
        int n=s.length();
        List<String> arr=new ArrayList<>();
        Set<String> set=new HashSet<>();

        int i=0;
        while(i<n){
            StringBuilder curr=new StringBuilder();
                for(int j=i;j<n;j++){
                    curr.append(s.charAt(j));
                    if(!set.contains(curr.toString())){
                        set.add(curr.toString());
                        arr.add(curr.toString());
                        i=j+1;
                        break;
                    }
                    else{
                        i++;
                        continue;
                    }
                }
        }    
        return arr;
    } 
}