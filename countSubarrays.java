class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = 0;
        int maxCount = 0;
        
        // Find maxElement and maxCount
        for (int num : nums) {
            if (num > maxElement) {
                maxElement = num;
                maxCount = 1;
            } else if (num == maxElement) {
                maxCount++;
            }
        }
        
        // If maxCount < k, return 0
        if (maxCount < k) {
            return 0;
        }
        
        long ans = 0;
        int count = 0;
        
        // Sliding window approach
        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[right] == maxElement) {
                count++; // Increment count if the current element is maxElement
            }
            
            // Shrink the window from the left until the count of maxElement in the window is less than k
            while (count >= k) {
                ans += nums.length - right; // Increment ans by the number of valid subarrays ending at right
                if (nums[left] == maxElement) {
                    count--; // Decrement count if the left element is maxElement
                }
                left++; // Move the left pointer
            }
        }
        
        return ans;
    }
}
