class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
         String[] arrayOfStrings = s.split(" "); // Split the string by space
         int n = arrayOfStrings.length - 1;
         String str = arrayOfStrings[n];
         int len = str.length();
         return len;
    }
}