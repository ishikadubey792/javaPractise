import java.util.HashMap;

public class Solution {
	public static String amazingStrings(String first, String second,String third) {
		// Write your code here.
		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0;i<first.length();i++){
			char c = first.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c) +1);
			} else {
				map.put(c, 1);
			}
		}

		for(int i=0;i<second.length();i++){
			char c = second.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c) +1);
			} else {
				map.put(c, 1);
			}
		}


		for(int i=0;i<third.length();i++){
			char c = third.charAt(i);
			if(!map.containsKey(c)){
				return "NO";
			}else {
				map.put(c, map.get(c) - 1);
			}
		}

		boolean allValuesAreZero = true;

        for (Integer value : map.values()) {
            if (value != 0) {
                return "NO";
            }
        }

		return "YES";
	}
}
