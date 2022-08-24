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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
       
        return checkSum(root, targetSum, 0);
        

        
    }
    
    public boolean checkSum(TreeNode root, int targetSum, int rollingSum) {
        
         if(root == null) return false;
            
         rollingSum += root.val;
        
        if(root.right == null && root.left == null) {
            return (targetSum == rollingSum);
        }
        
       return (checkSum(root.right, targetSum, rollingSum) || checkSum(root.left, targetSum, rollingSum));
        
        
       
 
    }
}