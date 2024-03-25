import java.util.*;
class Solution {
    public int reverse(int x) {
       long res = 0;
       
       while(x!=0){
          int digit = x % 10;
          res = res*10 + digit;
          x = x / 10;        
       }

       // Check the integer value is within the range
        if (res >= -(1 << 31) && res <= (1 << 31) - 1) {
            int intValue = (int) res; // Casting long to int
            return intValue;

        } else {
            return 0;
        }
    }
}