public class Solution {
    public string[] UncommonFromSentences(string s1, string s2) {
        string[] str1=s1.Split(' ');
        string[] str2=s2.Split(' ');

        Dictionary<string,int> d1=new Dictionary<string,int>();

        for(int i=0;i<str1.Length;i++){
            if(!d1.ContainsKey(str1[i])){
                d1.Add(str1[i],1);
            }
            else{
                d1[str1[i]]++;
            }
        }

        for(int i=0;i<str2.Length;i++){
            if(!d1.ContainsKey(str2[i])){
                d1.Add(str2[i],1);
            }
            else{
                d1[str2[i]]++;
            }
        }
    List<string> uncommonWords = new List<string>();
        foreach(KeyValuePair<string,int> entry in d1){
            if(entry.Value==1){
                uncommonWords.Add(entry.Key);
            }
        }
        return uncommonWords.ToArray();
    }
}