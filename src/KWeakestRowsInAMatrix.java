/*
Runtime: 3 ms, faster than 39.19% of Java online submissions for The K Weakest Rows in a Matrix.
Memory Usage: 40.8 MB, less than 30.55% of Java online submissions for The K Weakest Rows in a Matrix.
*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < mat.length; i++) {
            count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            map.put(i, count);
        }
        // PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(map.entrySet(), (a,b)->(a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : a.getValue().compareTo(b.getValue())));
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(map.size(), new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return (a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : a.getValue().compareTo(b.getValue()));
            }
        });
        pq.addAll(map.entrySet());
        int[] rows = new int[k];
        for (int i = 0; i < k; i++) {
            rows[i] = pq.poll().getKey();
        }
        return rows;
    }
}