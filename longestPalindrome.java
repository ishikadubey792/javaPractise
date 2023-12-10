import java.util.HashSet;
// Time Complexity : O(n)
class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
          // Create a HashSet...
        HashSet<Character> set = new HashSet<>();

    // Traverse every element through loop....
        for(int i=0;i<s.length();i++){
        // convert string to char 
            char ch = s.charAt(i);
         // If set contains character already, remove that character & adding 2 to length...
         // It means we get pair of character which is used in palindrome...
            if(set.contains(ch)){
                length += 2;
                set.remove(ch);
            }else{
                 // Otherwise, add the character to the hashset...
               set.add(ch);
            }
        }

         // If the size of the set is greater than zero, move length forward...
        if(set.size()>0){
            length++;
        }

        return length;         // Return the length of the longest palindrome...

    }
}