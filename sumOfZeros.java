import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here.
		int count = 0;
		int n = mat.size();
		int m = mat.get(0).size();

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
                 if(mat.get(i).get(j)==0){
					 if(j>0 && mat.get(i).get(j-1)==1){
						 // top
						 count++;
					 }
					 if((j+1)<m && mat.get(i).get(j+1)==1){
						 // bottom
						 count++;
					 }
					 if(i>0&&mat.get(i-1).get(j)==1){
						 //left
						 count++;
					 }
					 if((i+1)!=mat.size()&&mat.get(i+1).get(j)==1){
						 //right
						 count++;
					 }
				 }
			}
		}
		return count;
	}
}
