/*
Runtime: 5 ms, faster than 91.34% of Java online submissions for Top K Frequent Words.
Memory Usage: 39.7 MB, less than 52.20% of Java online submissions for Top K Frequent Words.
*/

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], 1 + map.getOrDefault(words[i], 0));
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a));
        return list.subList(0, k);
    }
}