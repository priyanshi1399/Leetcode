class Solution {
    private void solve(int index,String digits, HashMap<Character,String> map,StringBuilder curr,List<String> result){
        if(index>=digits.length()){
            result.add(curr.toString());
            return;
        }

        if(map.containsKey(digits.charAt(index))){
            String str=map.get(digits.charAt(index));
            System.out.println(str);
                for(int i=0;i<str.length();i++){
                    curr.append(str.charAt(i));
                    solve(index+1,digits,map,curr,result);
                    curr.deleteCharAt(curr.length()-1);
                }
            }
        }
    
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> result=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        if(digits.equals("")){
            return result;
        }
        solve(0,digits,map,curr,result);
        
        return result;
    }
}