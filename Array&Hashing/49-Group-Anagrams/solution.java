class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> recordList = new  HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] count = new char[26];
            for(int c = 0; c < strs[i].length(); c++){
                count[(int)strs[i].charAt(c) - (int)'a'] += 1;
            }
            String keyStr = String.valueOf(count);
            if(!recordList.containsKey(keyStr)){
                recordList.put(keyStr , new ArrayList<>());
            }
            recordList.get(keyStr).add(strs[i]);
        }
        return new ArrayList<>(recordList.values());
    }
}