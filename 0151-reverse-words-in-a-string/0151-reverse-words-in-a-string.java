class Solution {
    public String reverseWords(String s) {
        int i=0;
        int n=s.length();
        int start=0;
        int end=0;
        List<String> lst=new ArrayList<>();
        while(i<n){
        while(i<n && s.charAt(i)==' '){
               i++;  
            //encountered a character
        }
        start=i;
        if(i>=n){
        break;
        }
        while(i<n && s.charAt(i)!=' '){ //encountered space
            i++;
        }
        end=i-1;
        String s3=s.substring(start,end+1);
        System.out.println(s3);
        lst.add(s3);
        }
       StringBuilder ans=new StringBuilder();
       for(int j=lst.size()-1;j>=0;j--){
        ans.append(lst.get(j));
        if(j!=0){
            ans.append(' ');
        }
       }
       return ans.toString();
    }
}