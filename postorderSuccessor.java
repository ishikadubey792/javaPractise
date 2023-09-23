import java.util.* ;
import java.io.*; 

/*******************************************************
Following is the BinaryTreeNode class structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*******************************************************/

public class Solution
{    
	public static int postOrderSuccessor(BinaryTreeNode<Integer> root, int M)
	{
         if(root==null){
             return -1;
         }
         
         ArrayList<Integer> arr = new ArrayList<>();
         postOrder(root , arr);
          
          for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            if (n == M && i < arr.size() - 1) {
                int ans = arr.get(i + 1);
                return ans;
            }
        }
        return -1;
    }
    
    public static void postOrder(BinaryTreeNode<Integer> root , ArrayList<Integer> arr){
          if (root == null) {
            return;
        }
        
        postOrder(root.left, arr);
        postOrder(root.right, arr);
        
        arr.add(root.data);
        
        
    }

}
