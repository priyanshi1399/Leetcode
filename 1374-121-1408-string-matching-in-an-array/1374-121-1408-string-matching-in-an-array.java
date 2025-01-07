class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((words[i].contains(words[j])) && (!words[i].equals(words[j]))){
                    if(!lst.contains(words[j])){
                    lst.add(words[j]);
                }
                }
                else{
                    continue;
                }
            }
        }
        return lst;
    }
}
/*
 public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(words[i].contains(words[j])){
                    if(!lst.contains(words[j])){
                    lst.add(words[j]);
                }
                }
            }
        }
        return lst;
    }
}

*/