import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> intersection = new ArrayList<>();

 
        // Count frequency of elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                intersection.add(num);
               map.put(num, map.get(num) - 1);
            }
        }
         
        // convert ArrayList to an int array
        int[] result = new int[intersection.size()];
        int index = 0;
        for(int num : intersection){
              result[index++] = num;
        }
        
        return result;
    }
}