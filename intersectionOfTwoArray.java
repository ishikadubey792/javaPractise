import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
 
        // Add elements from num1 to set1
        for(int num : nums1){
             set.add(num);
        }

        // find intersection between set1 and num2
        for(int num : nums2){
            if(set.contains(num)){
                intersectionSet.add(num);
            }
        }

        // convert intersection set to an int array 
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for(int num : intersectionSet){
              result[index++] = num;
        }

        return result;
    }
}