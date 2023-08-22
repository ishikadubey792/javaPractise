import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int boringFactorials(int n, int p)
    {
        // Write your code here.
         int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % p; // Calculate the remainder at each step
        }

        return ans;
    }
}
