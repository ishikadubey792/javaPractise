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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
            height(root); // Calculates the height and updates 'res'

            return res; // Returns the diameter of the binary tree

    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = height(root.left);  // Recursively calculates the height of the left subtree
        int right = height(root.right);  // Recursively calculates the height of the right subtree

        res = Math.max(res , left + right);  // Update 'res' with the maximum diameter found so far
        
        int maxHeight = Math.max(left,right) + 1;

        return maxHeight;  // Return the height of the current subtree rooted at 'root'
    }
}