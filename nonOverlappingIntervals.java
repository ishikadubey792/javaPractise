import java.util.HashMap;
import java.util.*;

public class Solution {
	public static int minimumReschedules(int n, int[][] intervals) {
		// Write your code here.
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[1])); // Sort intervals by end time
        
        int count = 0;
        int lastEndTime = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] >= lastEndTime) {
                lastEndTime = intervals[i][1];
            } else {
                count++;
            }
        }
        
        return count;
	}
	public static boolean check(HashMap<Integer,Integer> map , boolean isLess , int num){

		for (Integer key : map.keySet()) {
            if (num <= key) {
                isLess = false;
                 return isLess;
            }
        }
		return true;
	}
}