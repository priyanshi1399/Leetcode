class Solution {
    public int check(char firstChar, char secondChar,Stack<Character> stck){
        int count=0;
        StringBuilder str=new StringBuilder();
        while(!stck.isEmpty()){
            if(stck.peek()==firstChar && str.length()>0 && str.charAt(str.length()-1)==secondChar){
                str.deleteCharAt(str.length()-1);
                //System.out.println("What is the String after remval"+str.toString());
                stck.pop();
                count++;
            }
            else{
            str.append(stck.pop());
            //System.out.println(str.toString());
            }
        }
        return count;

    }
    public int minimumDeletions(String s) {
        Stack<Character> stck=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            stck.push(ch);
        }

        return check('b','a',stck);

    }
}