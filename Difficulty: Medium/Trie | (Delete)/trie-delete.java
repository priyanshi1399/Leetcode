/*Complete the function below
Node is as follows:
class TrieNode
{
    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}*/
class Solution {
    public static boolean isEmpty(TrieNode root){
        return root.childList.isEmpty() || root.childList==null;
    }
    public static TrieNode remove(int i,TrieNode root, char[]key){
        
        if(root==null){
            return null; //if root is null;
        }
        
        if(i==key.length){ //reached at the last node of the Trie
            
            if(root.isEnd){
                root.isEnd=false;
            }
            
            if(isEmpty(root)){
                root=null;
            }
            return root;
        }
        
        char ch=key[i];
        TrieNode child=root.subNode(ch);
        if(child!=null){
            TrieNode updatedChild=remove(i+1,child,key);
            if(updatedChild==null){
                root.childList.remove(child);
            }
        }
        
        if(isEmpty(root) && root.isEnd==false){ 
            //that means its other child  node got deleted 
            return null;
            
        }
        return root;
    }
    public static void deleteKey(TrieNode root, char[] key) {
        
        remove(0,root,key);
        
    }
}