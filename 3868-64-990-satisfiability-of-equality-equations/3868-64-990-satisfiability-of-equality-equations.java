class Solution {
    public int find(int x,int [] parent){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x],parent);
    }

    public void union(int x,int y,int [] parent, int [] rank){

        int x_parent=find(x,parent);
        int y_parent=find(y,parent);

        if(x_parent==y_parent){
            return;
        }
        else if(rank[x_parent]>rank[y_parent]){
            parent[y_parent]=x_parent;
        }
        else if(rank[y_parent]>rank[x_parent]){
            parent[x_parent]=y_parent;
        }
        else{
            parent[y_parent]=x_parent;
            rank[x_parent]++;
        }
    }
    public boolean equationsPossible(String[] equations) {
        int [] parent=new int[26];
        int [] rank=new int[26];
        int n=equations.length;
        for(int i=0;i<26;i++){
            parent[i]=i;
        }
        for(int i=0;i<n;i++){
            if(equations[i].charAt(1)=='='){
            union(equations[i].charAt(0)-'a',equations[i].charAt(3)-'a',parent,rank);
              
            }
        }

        for(String s:equations){
            if(s.charAt(1)=='!'){
                int a=find(s.charAt(0)-'a',parent);
                int b=find(s.charAt(3)-'a',parent);

                if(a==b){
                    return false;
                }
            }
        }
        return true;
    }
}