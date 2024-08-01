class Solution {
    public List<List<String>> Anagrams(String[] strs) {
        // Code here
        Map<String,List<String>>m=new HashMap<>();
        for(String s:strs){
    
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String sorted=new String(a);

            if(!m.containsKey(sorted)){
                m.put(sorted,new LinkedList<String>());
            }
            m.get(sorted).add(s);
        }
        return new LinkedList<>(m.values());
    
    }
}
