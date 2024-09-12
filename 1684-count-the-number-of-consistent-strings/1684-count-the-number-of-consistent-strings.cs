public class Solution {
    public int CountConsistentStrings(string allowed, string[] words) {
        int cnt=0;
        for(int i=0;i<words.Length;i++){
            bool b=false;
        for(int j=0;j<words[i].Length;j++){
            if(!allowed.Contains(words[i][j])){
                b=true;
                break;
            }
        }
        if(b==false){
            cnt++;
        }
        }
        return cnt;
    
    }
}