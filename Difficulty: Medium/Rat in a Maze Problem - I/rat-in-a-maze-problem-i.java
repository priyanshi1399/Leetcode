class Solution {
    int m;
    int n;
    // Function to find all possible paths
    public void backtrack(int i,int j,int [][] maze, List<String> res,StringBuilder curr,int m,int n){
        if(i==m-1 && j==n-1){
            res.add(curr.toString());
            return;
        }
        
        
        if(i<0 || j<0 || i>=m || j>=n || maze[i][j]==0){
            return;
        }
        
        
        maze[i][j]=0;
        
        curr.append('L');
        backtrack(i,j-1,maze,res,curr,m,n);
        curr.deleteCharAt(curr.length()-1);
        
        curr.append('R');
        backtrack(i,j+1,maze,res,curr,m,n);
        curr.deleteCharAt(curr.length()-1);
        
        curr.append('U');
        backtrack(i-1,j,maze,res,curr,m,n);
        curr.deleteCharAt(curr.length()-1);
        
         curr.append('D');
        backtrack(i+1,j,maze,res,curr,m,n);
        curr.deleteCharAt(curr.length()-1);
        
        maze[i][j]=1;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        m=maze.length;
        n=maze[0].length;
        ArrayList<String> res=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        if(maze[0][0]==0){
            return res;
        }
        backtrack(0,0,maze,res,curr,m,n);
            Collections.sort(res);
            return res;
        
        
        
    }
}