class TrieNode{
    boolean endOfWord;
    TrieNode [] children;
    
    public TrieNode(){
        endOfWord=false;
        children=new TrieNode[26];
    }
    
   
}
class Solution {
     public TrieNode getTrieNode(){
        return new TrieNode();
    }
    public String longestString(String[] words) {
        TrieNode root=getTrieNode();
        int n=words.length;
        for(int i=0;i<n;i++){
            String str=words[i]; //"p"
            
            TrieNode crawl=root;
            for(int j=0;j<str.length();j++){
                int idx=str.charAt(j)-'a';
                if(crawl.children[idx]==null){
                    crawl.children[idx]=getTrieNode();
                }
                crawl=crawl.children[idx];
            }
            crawl.endOfWord=true;
            
        }
        int maxLength=0;
        String ans="";
          for(int i=0;i<n;i++){
            String str=words[i]; //"p"
            
            TrieNode crawl=root;
            int j=0;
            for(;j<str.length();j++){
                int idx=str.charAt(j)-'a';
               
                 if(j>0 && crawl.endOfWord==false || crawl.children[idx]==null){
                    break;
                }
                 crawl=crawl.children[idx];
            }
            if(j==str.length() && crawl.endOfWord==true){
                if(str.length()>maxLength){
                    maxLength=str.length();
                    ans=str;
                    
                }
                else if(str.length()==maxLength){
                    if(str.compareTo(ans)<0){
                        ans=str;
                    }
                }
            }
          }
            return ans;
            
        
        
    }
}
