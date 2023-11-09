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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return new ArrayList<>(); // Return an empty list if the root is null
        }
               // Create a list of strings
         List<String> stringList = new ArrayList<>();
         helper(root,"",stringList); // Pass an empty string as the current path
         return stringList;
    }
    public void helper(TreeNode root,String currentPath, List<String> str){
        if(root==null){
            return;
        }
           if(root.left==null && root.right==null){
                // If it's a leaf node, add the current path to the list
                str.add(currentPath+root.val);
               return;
           }
          // recursively traverse the left and right subtree
            helper(root.left,currentPath+root.val+ "->",str);
            helper(root.right,currentPath+root.val+ "->",str);
    }
}