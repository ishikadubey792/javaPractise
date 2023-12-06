class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
         if(s.length()<=1){
             return s;
         }

        char[] chars = s.toCharArray();
         int i=0;
         int j= s.length() - 1;
         while(i<j){
            if(isVowel(chars[i]) && isVowel(chars[j])){
                  // swap vowels                 
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                  i++;
                  j--;
            } else if(!isVowel(chars[i])){
                i++;
            } else if(!isVowel(chars[j])){
                j--;
            }
         }
         return new String(chars);
    }
}