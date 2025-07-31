class TrieNode{
    boolean endOfWord;
    TrieNode [] children;
    
    public TrieNode(){
        endOfWord=false;
        children=new TrieNode[26];
    }
    
}


class Solution {
    private   TrieNode root=new TrieNode();
    

    private  TrieNode getTrieNode(){ //making anew TrieNode
            return new TrieNode();
    }
    public String longestValidWord(String[] words) {
      
        
        int n=words.length;
        
       for(int i=0;i<n;i++){
           
           String str=words[i];
           
           TrieNode crawl=root;
           for(int j=0;j<str.length();j++){
               char ch=str.charAt(j);
               
               int idx=ch-'a';
               if(crawl.children[idx]==null ){
                   crawl.children[idx]=getTrieNode();
               }
               
               crawl=crawl.children[idx];
           }
           crawl.endOfWord=true;
           
       }
       
      
       int maxLength=0;
       String ans="";
    for(int i=0;i<n;i++){
         
        String str=words[i];
        TrieNode crawl=root;
        int j=0;
        for(;j<str.length();j++){
              char ch=str.charAt(j);
               
               int idx=ch-'a';
               if(crawl.children[idx]==null || !crawl.children[idx].endOfWord){
                   break;
               }
                crawl=crawl.children[idx];
        }
        if(j==str.length()){
            if(str.length()>maxLength){
                ans=str;
                maxLength=str.length();
            }
            else if(str.length()==ans.length() && str.compareTo(ans)<0){
                ans=str;
            }
        }
        
    }
    return ans;
        
        
    }
}