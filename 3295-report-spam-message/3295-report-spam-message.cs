public class Solution {
    public bool ReportSpam(string[] message, string[] bannedWords) {
        Dictionary<string,int> d1=new Dictionary<string,int>();
        int count=0;
        for(int i=0;i<bannedWords.Length;i++){
            if(!d1.ContainsKey(bannedWords[i])){
                d1.Add(bannedWords[i],1);
            }
            else{
                d1[bannedWords[i]]++;
            }
        }
        for(int i=0;i<message.Length;i++){
            if(d1.ContainsKey(message[i])){
                count++;
        }
        }
        if(count>1){
            return true;
        }
        else{
            return false;
        }
    }
}
