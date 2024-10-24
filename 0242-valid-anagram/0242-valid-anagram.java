//repeat in HashMap
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){ //o(n)
            return false;
        }
        char [] s1=s.toCharArray(); //o(n)
        char [] t1=t.toCharArray(); //o(n)

        Arrays.sort(s1); //(nlogn)
        Arrays.sort(t1); //(nlogn)
        return Arrays.equals(s1,t1); //o(n)

        /*if(s.length()!=t.length()){
            return false; //base case
        }
        char [] s1=s.toCharArray();
        char [] t1=t.toCharArray();
        int count=0;
        for(int i=0;i<t1.length;i++){
            for(int j=0;j<s1.length;j++){
                if(t1[i]==s1[j]){
                    if(s1[j]!='#'){
                        s1[j]='#';
                        count++;
                        break; //it will be out of j and start with i again from 0 in s1
                    }
                    else if(s1[j]=='#') {//character encountered before
                    continue; //increasing i
                    }
                }
            }
        }
        if(count==s.length()){
            return true;
        }
        else{
            return false;
        }
    */  
    }
}
//TC(0(n^2))->two loops
//S(C)=0(n)