import java.util.* ;
import java.io.*; 
import java.util.ArrayList;



public class Solution {

	public static ArrayList<ArrayList<Integer>> ninjaCity(ArrayList<ArrayList<Integer>> mat) {
		// Write your code here
		 ArrayList<ArrayList<Integer>> newArr = new ArrayList<>(); // Initialize a 2D ArrayList
		int n = mat.size()-1;
        for(int i=0;i<=n;i++){
			ArrayList<Integer> newRow = new ArrayList<>(); // Initialize a new row for the reversed matrix
		    ArrayList<Integer> Row = mat.get(i); // Get the current row from mat
             for(int j=Row.size()-1;j>=0;j--){
				 int c = Row.get(j); // Get the element from the current row
				 newRow.add(c); // Add the element to the new row
			 }
			 newArr.add(newRow); // Add the new row to the new matrix
		}
		return newArr;
	}
}