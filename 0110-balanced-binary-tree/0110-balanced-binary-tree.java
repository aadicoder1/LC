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
    public boolean isBalanced(TreeNode root) {
        return height(root)[0]==1; 
    }
    private int[] height(TreeNode root){
        if(root==null) return new int[] {1,0};
        int[] left=height(root.left);
        int[] right=height(root.right);
        boolean isBalanced= left[0]==1 && right[0]==1 && Math.abs(left[1]-right[1])<=1;
        return new int[]{isBalanced ? 1 : 0, 1 + Math.max(left[1], right[1])};
    }
}