class Solution {
    public boolean isSubsequence(String s, String t) {
       // initilize two pointers for both strings
        int i=0;
        int j=0;

        while(i < s.length() && j < t.length()){
            // compare characters , incremen both pointers if same
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
                j++; // // always increment the pointer for string t
        }
         
         // if it is subsequence, 'i' will have travelled full 
         // length of string s, so just check and return 
        return (i==s.length());
    }
}