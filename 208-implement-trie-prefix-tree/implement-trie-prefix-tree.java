class Trie {
    static class TrieNode{
        boolean endOfWord;
        TrieNode [] children;

        public TrieNode(){
            endOfWord=false; //this will tell whether any word have ended on it
            children=new TrieNode[26]; //it will be all lowercase letter
        }
    }

    private TrieNode root;

    public Trie() {
        root=new TrieNode();
    }
    
    private TrieNode getTrieNode(){ //making anew TrieNode
            return new TrieNode();
    }
    public void insert(String word) {
        TrieNode crawl=root;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);

            int idx=ch-'a';

            if(crawl.children[idx]==null){ //if node not exist for that charcater
                crawl.children[idx]=getTrieNode();          //create a new Node
            }

            crawl=crawl.children[idx];
        }
        //at teh end mark endOfWord=true;
        crawl.endOfWord=true;
        }

    
    public boolean search(String word) {
        TrieNode crawl=root;

        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int idx=ch-'a';

            if(crawl.children[idx]==null){
                return false; //that node index also dosent exist
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

        int i=0;
        for(;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            int idx=ch-'a';

            if(crawl.children[idx]==null){
                return false;
            }

            crawl=crawl.children[idx];
        }
        if(i==prefix.length()){
            return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */