class Solution {
    public boolean isAnagram(String s, String t) {
        //If theirs lengths are not equal then they can not be anagram.
        if(s.length() != t.length()) return false;
        
        
        HashMap<Character,Integer> sCountList = new HashMap<>();
        HashMap<Character,Integer> tCountList = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char currSChar = s.charAt(i);
            char currTChar = t.charAt(i);
            if(sCountList.containsKey(currSChar)){
                sCountList.put(currSChar, sCountList.get(currSChar) + 1);
            }
            else{
                sCountList.put(currSChar , 1);
            }

            if(tCountList.containsKey(currTChar)){
                tCountList.put(currTChar, tCountList.get(currTChar) + 1);
            }
            else{
                tCountList.put(currTChar, 1);
            }
        }

        if(sCountList.equals(tCountList)){ return true;}
        return false;
    }
}