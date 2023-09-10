import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.size() - 1;
        int carry = 1;
         
        for(int i=n;i>=0;i--){
            int sum = arr.get(i) + carry;
            ans.add(0,sum%10);
            carry = sum / 10;
        }

        while(carry>0){
             ans.add(0, carry % 10);
            carry /= 10;
        }
        // Remove leading zeros from the result
        while (!ans.isEmpty() && ans.get(0) == 0) {
            ans.remove(0);
        }
        return ans;
    }
}
