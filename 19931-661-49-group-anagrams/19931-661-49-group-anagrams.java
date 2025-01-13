class Solution {

    
       
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s: strs){
            char [] ch=s.toCharArray();
            Arrays.sort(ch);

            String newSorted=new String(ch);

            if(!map.containsKey(newSorted)){
            map.put(newSorted,new ArrayList<>());
            }
            map.get(newSorted).add(s);
        }

        List<List<String>> ans= new ArrayList<>();
        for(Map.Entry<String, List<String>> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
/*
 HashMap<String, List<String>> map=new HashMap<>();
        for(String s: strs){
            char [] ch=s.toCharArray();
            Arrays.sort(ch);

            String newSorted=new String(ch);

            if(!map.containsKey(newSorted)){
            map.put(newSorted,new ArrayList<>());
            }
            map.get(newSorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}*/