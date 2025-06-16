class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }
        Stack<String> stck=new Stack<>();
        for(int i=0;i<parts.length;i++){
            if(parts[i].equals(".") || parts[i].equals("")){
                continue;
            }
            else if(parts[i].equals("..")){
                if(!stck.isEmpty()){
                    stck.pop();
                }
            }
            else{
                stck.push(parts[i]);
            }
        }

        if(stck.isEmpty()){
            return "/";
        }
        String ans="";
        while(!stck.isEmpty()){
            ans="/"+stck.pop()+ans;
        }
        return ans;
    }
}