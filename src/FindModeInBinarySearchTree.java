/*
Runtime: 4 ms, faster than 44.41% of Java online submissions for Find Mode in Binary Search Tree.
Memory Usage: 41 MB, less than 52.09% of Java online submissions for Find Mode in Binary Search Tree.
*/

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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        findMode(root, map);
        Integer max = 0;
        Set<Integer> s = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                s.clear();
                max = e.getValue();
                s.add(e.getKey());
            } else if (e.getValue() == max) {
                s.add(e.getKey());
            }
        }
        int[] ints = new int[s.size()];
        int i = 0;
        for (Integer n : s) {
            ints[i++] = n;
        }
        return ints;
    }
    
    public void findMode(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        map.put(root.val, 1 + map.getOrDefault(root.val, 0));
        findMode(root.left, map);
        findMode(root.right, map);
    }
}