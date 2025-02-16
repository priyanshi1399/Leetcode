class Solution {
    public boolean isSubsequence(String s, String t) {
        HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.putIfAbsent(t.charAt(i),new ArrayList<>());
            map.get(t.charAt(i)).add(i);            
        }
        int prev=-1;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){ //if that charcater is not present
                return false;
            }
            
            List<Integer> indices=map.get(s.charAt(i));
            //System.out.println("Size of teh List is" +indices.size());
            int index= UpperBound(indices,prev);
            System.out.println("index is"+index);
        
            if(index==indices.size()){
                return false; //means we have not found 
            }

            prev=indices.get(index);
            //System.out.println(prev);
        }

            return true;

        }

    public int UpperBound (List<Integer> indices, int target){
        int l=0;
        int h=indices.size()-1;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(indices.get(mid)<=target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}
    /*public boolean isSubsequence(String s, String t) {
        int sLen=s.length();
        int tLen=t.length();
        if(sLen>tLen){
            return false;
        }
       int i=0;
       int j=0;
       while(i<sLen && j<tLen){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
       }
       if(i==sLen){
        return true;
       }
       return false;

    }
}  */
