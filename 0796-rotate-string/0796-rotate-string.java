class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if((s+s).contains(goal)){
            return true;
        }
        return false;
//T(C)->o(n) for above one and)(n) space  taking extra space for concatenate

//T.C : O(n^2)
//S.C : O(1)
       /* int n=s.length();
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<n;i++){
            String rotated=s.substring(i)+s.substring(0,i);
            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;*/
    }
}
