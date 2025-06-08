class Solution {
    public String robotWithString(String s) {
        int n=s.length();
        char [] minCharToRight=new char [n];

        minCharToRight[n-1]=s.charAt(n-1);
        for(int i=n-2;i>=0;i--){
            minCharToRight[i]=(char)Math.min(s.charAt(i),minCharToRight[i+1]);
        }

        Stack<Character> stck=new Stack<>();
        StringBuilder paper=new StringBuilder();

        for(int i=0;i<n;i++){
            stck.push(s.charAt(i));

            char mini=(i+1<n)?minCharToRight[i+1]:s.charAt(i);

            while(!stck.isEmpty() && stck.peek()<=mini){
                paper.append(stck.pop());
            }
        }

        while(!stck.isEmpty()){
            paper.append(stck.pop());
        }
        return paper.toString();

    }
}