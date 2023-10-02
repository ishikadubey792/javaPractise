import java.util.*;
class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to decimal integers
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry > 0){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i--) - '0';
            }
            if(j>=0){
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }
         return result.reverse().toString();

        
    }
}