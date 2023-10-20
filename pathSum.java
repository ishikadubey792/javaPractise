/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
            // Subtract the current node's value from the targetSum
               targetSum -= root.val;

                // If it's a leaf node and targetSum is 0, return true
           if(root.left == null && root.right == null){
            if(targetSum==0){
                return targetSum==0;
            }
        }

        // call left 
          boolean leftResult =  hasPathSum(root.left , targetSum);
        // call right
          boolean rightResult = hasPathSum(root.right , targetSum);
  
           // Return true if a path is found in either the left or right subtree
          return leftResult || rightResult;
        
    }
}