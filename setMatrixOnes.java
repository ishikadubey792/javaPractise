import java.util.* ;
import java.io.*; 
public class Solution
{
    public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m)
    {
        // Write your code here.

         ArrayList<Integer> arr1 = new ArrayList<>();
         ArrayList<Integer> arr2 = new ArrayList<>();

         for(int i=0;i<n;i++){
              arr1.add(i,0);
         }
          for(int i=0;i<m;i++){
              arr2.add(i,0);
         }
         
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(MAT.get(i).get(j)==1){
                      arr1.set(i, 1);
                      arr2.set(j, 1);
                 }
             }
         }

         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(arr1.get(i)==1 || arr2.get(j)==1){
                     MAT.get(i).set(j, 1);
                }
             }
         }
    }
}
