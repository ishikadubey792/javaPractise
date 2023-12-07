import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int index = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
            index = i;
        }

        return index + 1;
    }
}