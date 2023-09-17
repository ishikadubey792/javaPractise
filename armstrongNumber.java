import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		 // Convert the integer to a string
        String numberAsString = Integer.toString(num);

		 // Find the length of the string, which is the number of digits
        int digitCount = numberAsString.length();
           int sum = 0;
		   int temp = num;
		while(num>0){
             int r = num %10;
			 sum += Math.pow(r, digitCount);
			 num = num / 10;
		}

		if(sum == temp){
			return true;
		}

		return false;

	}
}

