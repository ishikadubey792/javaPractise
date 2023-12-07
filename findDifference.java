class Solution {
    public char findTheDifference(String s, String t) {
    //  approach 1 : hashmap :- make a hashmap and store characters of s string and check in t string      which is not in hashmap so that character is added 
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                // Subtract the value from the existing value
              int newValue = map.get(ch) - 1;

            // Update the HashMap with the new value
               map.put(ch , newValue);

               if(map.get(ch)<0){
                   return ch;
               }
            }else{
                return ch;
            }
        }
        return 0;

    // approach 2 : take the sum of all characters in ascii value s and t separately and than subtract t - s and return that result after converting in char 
       int sum_s = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int asciiValue = (int) c;
            sum_s += asciiValue;
        }

        int sum_t = 0;
        for(int i=0;i<t.length();i++){
               char c = t.charAt(i);
               int asciiValue = (int) c;
               sum_t += asciiValue;
        }

        int difference = sum_t - sum_s;
        char ch = (char) difference;

        return ch;

    // approach 3 : using xor :- 
          int xor = 0;
          for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
              xor ^= ch;
          }
           for(int i=0;i<t.length();i++){
              char ch = t.charAt(i);
              xor ^= ch;
          }

          return (char) xor;
    }
}