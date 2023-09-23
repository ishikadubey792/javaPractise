import java.util.* ;
import java.io.*; 
public class Solution {
	public static char firstNonRepeating(String str) {
		// Write your code here
		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(map.containsKey(ch)){
				 map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(map.get(ch)==1){
				return ch;
			}
		}

		return '#';
	}
}
