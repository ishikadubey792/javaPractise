import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxLength = 0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                maxLength = Math.max(maxLength, j - i);
                // Move the start of the window to the next index of the repeated character
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            // update the last seen index of a character 
                map.put(s.charAt(j) , j);
                // move to the next character 
                j++;
        }
        // Check for the last substring
        maxLength = Math.max(maxLength, j - i);
        return maxLength;
    }
}