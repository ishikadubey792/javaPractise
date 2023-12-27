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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        levelQueue.add(null);

        while(levelQueue.peek() != null){
            boolean foundX = false;
            boolean foundY = false;
            while(levelQueue.peek() != null){
                TreeNode node = levelQueue.poll();
                if(node.val == x){
                    foundX = true;
                } 
                if(node.val == y){
                    foundY = true;
                }
                if(node.left != null && node.right != null){
                    // Check if x and y are children of the same parent (siblings)
                    if((node.left.val==x && node.right.val==y) || (node.left.val==y&&node.right.val==x)){
                        return false;
                    }
                }

                if(node.left != null){
                    levelQueue.add(node.left);
                }
                if(node.right != null){
                    levelQueue.add(node.right);
                }
            }
            levelQueue.add(levelQueue.poll());
            if(foundX && foundY){
                return true;
            } else if(foundX || foundY){
                return false;
            }
        }
        return false;
    }
}