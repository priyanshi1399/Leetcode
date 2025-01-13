class Solution {

     public boolean canBeValid(String s, String locked) {
        if(s.length()%2!=0){
            return false;
        }
        int open=0;        
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || locked.charAt(i)=='0'){
                open++;
            }
            else{
                open--;
            }
            if(open<0){
            return false;
        }
        }
        int close=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==')' || locked.charAt(i)=='0'){
                close++;
            }
            else{
                close--;
            }
            if(close<0){
                return false;
            }
        }
    return true;

     }
}

    /*public boolean canBeValid(String s, String locked) {
        if((s.length())%2!=0){
            return false;
        }
        Stack<Integer> open=new Stack<>();
        Stack<Integer> openClosed=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'){
                openClosed.push(i);
            }
            else if(locked.charAt(i)=='1'){ 
            if(s.charAt(i)=='('){
                    open.push(i);
                }
            else if(s.charAt(i)==')'){
                    if(!open.isEmpty()){
                        open.pop();
                    }
                   else if(!openClosed.isEmpty()){
                    openClosed.pop();
                   }
                   else{
                    return false;
                   }
            }
            }
        }

            while(!open.isEmpty() && !openClosed.isEmpty() && open.peek()<openClosed.peek()){
                open.pop();
                openClosed.pop();
            }

        

        return open.isEmpty(); //OpenClosed will have always even pairs
    }
}*/