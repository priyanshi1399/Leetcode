class Solution {

    public void reverseString(char [] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {

        int n=s.length();
        int start=0;
        int end=0;
        int i=0;
        int j=0;

        char [] chars=s.toCharArray();
        
        reverseString(chars,0,n-1); //task-1 is to reverse the array

        //iterate j
        while(j<n){

            while(j<n && chars[j]==' '){ //till space increase j
                j++;
            }
            start=i; //give your start or update your start

            while(j<n && chars[j]!=' '){ //character found and goes till end of that whole characters "hello"
                chars[i]=chars[j]; //put j in i means shifting to the left
                i++;
                j++;
            }
            end=i-1;

            //reverse those characters
            reverseString(chars,start,end);

            if(j<n){ //we are not on end
            chars[i++] = ' '; //giving just one space no other space
             //j is on there only because again we go to while incraese j and repeats the steps
            }
        }
        if(chars[i-1]==' '){
            i=i-1;
        }
        String s3=new String(chars).substring(0,i).toString();
        return s3;

       /* int i=0;
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
       return ans.toString();*/
    }
}