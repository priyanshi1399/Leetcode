class Solution {
     public int countPalindromicSubsequence(String s) {

        int [] first=new int[26];
        int [] last=new int [26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);
        for(int i=0;i<s.length();i++){
            if(first[s.charAt(i)-'a']==-1){
                first[s.charAt(i)-'a']=i;
            }
            last[s.charAt(i)-'a']=i; //keep updating all the time
        }

        //[0,4],[2,-1][3,-1] //aabca
        int result=0;
        for(int i=0;i<26;i++){
            int leftMostIdx=first[i];
            int rightMostIdx=last[i]; //if 0 then its of a like this

            if(leftMostIdx==-1){
                continue;
            }
            HashSet<Character> set=new HashSet<>();
            

            for(int middle=leftMostIdx+1;middle<rightMostIdx;middle++){
                set.add(s.charAt(middle));
            }

        result=result+set.size();
        }
        return result;

     }
}

    /*public int countPalindromicSubsequence(String s) {
        HashSet<Character> uniqueCharacters=new HashSet<>();
        for(int i=0;i<s.length();i++){
            uniqueCharacters.add(s.charAt(i));
        }

        int result=0;
       // HashSet<String> result=new HashSet<>();
       for(char ch:uniqueCharacters){
        int leftMostIdx=-1;
        int rightMostIdx=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                if(leftMostIdx==-1) {//that means not seen till now
                leftMostIdx=i;
                System.out.println("left most index"+leftMostIdx);
                }
            rightMostIdx=i; //keep updating so that we reach till last;
            System.out.println("right index is"+rightMostIdx);                             
        }
        }
        
        HashSet<Character> set=new HashSet<>();
        for(int middle=leftMostIdx+1;middle<rightMostIdx;middle++){
            set.add(s.charAt(middle));
        }
         result=result+set.size();
        /*for(int i=leftMostIdx+1;i<rightMostIdx;i++){
            result.add(""+s.charAt(leftMostIdx)+s.charAt(i)+s.charAt(rightMostIdx));
        }*/
       //}
    //return result.size();
   // return result;
   // }
//}*/



//TLE below
    /* int countPalindromicSubsequence(String s) {
        int n=s.length();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=n-3;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(s.charAt(i)!=s.charAt(k)){
                    k--;
                }
                else{
                    String str=""+s.charAt(i)+s.charAt(j)+s.charAt(k);
                    map.put(str,i);
                    j++;
                }
            }
        }
        return map.size();
    }
}
*/