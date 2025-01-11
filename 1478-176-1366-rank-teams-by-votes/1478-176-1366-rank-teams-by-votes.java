class Solution {
    public String rankTeams(String[] votes) {
        int n=votes[0].length();
        int [][] arr=new int [26][n+1];
        for(int i=0;i<26;i++){
            arr[i][n]=i;
        }

        for(int i=0;i<votes.length;i++){
            String s=votes[i];
            for(int j=0;j<n;j++){
                arr[s.charAt(j)-'A'][j]++; // 22nd row 0 th posiotion 
            }
        }

        Arrays.sort(arr, (a,b)->{
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    return Integer.compare(b[i],a[i]); //bigger will come first
                }
            }
            return Integer.compare(a[n],b[n]);
        });

        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
           // System.out.println(str.append((char)(arr[i][n]+'A')));
           str.append((char)(arr[i][n]+'A'));
        }

    return str.toString();


    }
}

/*
["WXYZ", "XYZW", "WZXY", "XYWZ", "YZXW"]
row will represent character
element in row will represent the times we have got that position
W: 0 0 0 0
X: 0 0 0 0
Y: 0 0 0 0
Z: 0 0 0 0

W: 2 0 1 2 22
X: 2 1 2 0 23
Y: 1 2 1 1 24
Z: 0 2 1 2 25
After Sorting

After Sorting
X: 2 1 2 0 23
W: 2 0 1 2 22
Y: 1 2 1 1 24
Z: 0 2 1 2 25

Z: 0 2 1 2 
suppose  then 122 will come first
XWYZ
*/



