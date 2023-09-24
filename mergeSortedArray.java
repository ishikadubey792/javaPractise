class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          if(n==0){
              return;
          }   

          int i = m-1; // index for num1
          int j = n-1;  // index for num2
          int k = m+n-1; // index for the merged array

          while(i>=0 && j>=0){
              if(nums1[i]>nums2[j]){
                   nums1[k] = nums1[i];
                   i--;
              }else{
                    nums1[k] = nums2[j];
                    j--;
              }
              k--;
          }
 // If there are remaining elements in nums2, they need to be copied to nums1

             while(j>=0){
                 nums1[k] = nums2[j];
                 j--;
                 k--;
             }
    }
}