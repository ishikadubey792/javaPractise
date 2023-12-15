import java.util.*;
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int indexSum = i + map.get(list2[i]);
                if(indexSum < minIndexSum){
                    result.clear();
                    result.add(list2[i]);
                    minIndexSum = indexSum;
                } else if(minIndexSum == indexSum){
                    result.add(list2[i]);
                }
            }
        }
         return result.toArray(new String[result.size()]);
    }
}