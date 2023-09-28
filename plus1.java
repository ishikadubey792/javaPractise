import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
         ArrayList<Integer> arrayList = new ArrayList<>();

         int lastIdx = digits.length - 1;
         
         int carry = 1;
        
         
         for(int i=lastIdx;i>=0;i--){
             int sum = digits[i] +  carry;
              carry = sum /10;
              arrayList.add(0,sum % 10); 
         }

         if(carry>0){
             arrayList.add(0,carry);
         }

         
         // Convert ArrayList to an Integer[] array
        Integer[] integerArray = arrayList.toArray(new Integer[0]);

         // Convert Integer[] array to an int[] array
        int[] resultArray = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            resultArray[i] = integerArray[i];
        }


        return resultArray;
    }
}