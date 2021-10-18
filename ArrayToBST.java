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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return arrayToTree(nums, 0, nums.length-1);
        }
    
    public TreeNode arrayToTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int midpoint = (left+right)/2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = arrayToTree(nums, left, midpoint-1);
        node.right = arrayToTree(nums, midpoint+1, right);
        return node;
    }
}
