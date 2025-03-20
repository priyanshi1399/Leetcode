//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public void solve(int i,int j,ArrayList<ArrayList<Integer>> mat,int n,StringBuilder curr, ArrayList<String> result, boolean [][] visited ){
       if(i<0 || j<0 || i>=n || j>=n || mat.get(i).get(j)==0 || visited[i][j]==true){
            return;
        }
        if(i ==n-1 && j==n-1){
            result.add(curr.toString());
            return;
        }

        visited[i][j]=true;

        curr=curr.append('L');
        solve(i,j-1,mat,n,curr,result,visited);
        curr.deleteCharAt(curr.length()-1);

        curr=curr.append('R');
        solve(i,j+1,mat,n,curr,result,visited);
        curr.deleteCharAt(curr.length()-1);

        curr=curr.append('U');
        solve(i-1,j,mat,n,curr,result,visited);
        curr.deleteCharAt(curr.length()-1);

        curr=curr.append('D');
        solve(i+1,j,mat,n,curr,result,visited);
        curr.deleteCharAt(curr.length()-1);

        visited[i][j]=false;

    }
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
         int n=mat.size();
        ArrayList<String> result=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        boolean [][]  visited=new boolean[n][n];
                    solve(0,0,mat,n,curr,result,visited);
        Collections.sort(result);
        return result;
    }
}
        