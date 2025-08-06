class TrieNode{
    boolean endOfWord;
    TrieNode [] children;
    public TrieNode() {
        endOfWord=false; //check at the end
        children=new TrieNode[26]; //taking 26 letters of array
    }

}
class Trie {
    TrieNode root;
    public Trie(){
            root=new TrieNode();
    }
    public TrieNode getTrieNode(){
        return new TrieNode();
    }
    
    
    public void insert(String word) {
        TrieNode crawl=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(crawl.children[idx]==null){
                crawl.children[idx]=getTrieNode();
            }
            crawl=crawl.children[idx];
        }
        crawl.endOfWord=true;
    }
    
    public boolean search(String word) {
         TrieNode crawl=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(crawl.children[idx]==null){
                return false;
            }
            crawl=crawl.children[idx];
        }
        if(crawl.endOfWord==true){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
          TrieNode crawl=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(crawl.children[idx]==null){
                return false;
            }
            crawl=crawl.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */