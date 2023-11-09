class Solution {
    public int search(int[] nums, int target) {
         HashMap<Integer,Integer> map = new HashMap<>();

         for(int i=0;i<nums.length;i++){
             map.put(nums[i],i);
         }  

         // Checking if a key is present
        if(map.containsKey(target)) {
              int res = map.get(target);
              return res;
        }else {
            return -1;
        }
    }
}