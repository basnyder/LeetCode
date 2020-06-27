/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
Memory Usage: 36.1 MB, less than 59.70% of Java online submissions for Unique Binary Search Trees.
*/

class Solution {
    //With Dynamic Programming
    List<Integer> trees = new ArrayList<>();
    public int numTrees(int n) {
        if (n == 1) {
            if (trees.isEmpty()) {
                trees.add(1);
            }
            return 1;
        }
        if (n >= trees.size()) {
            trees.add((int) (numTrees(n - 1) * (4.0 * n - 2) / (n + 1)));
        }
        return trees.get(n - 1);
    }

    //With Recursion
    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) (numTrees(n - 1) * (4.0 * n - 2) / (n + 1));
    }
}

