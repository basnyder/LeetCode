/*
Runtime: 4 ms, faster than 59.14% of Java online submissions for String Matching in an Array.
Memory Usage: 39.8 MB, less than 34.56% of Java online submissions for String Matching in an Array.
*/

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    strings.add(words[j]);
                } else if (words[j].contains(words[i])) {
                    strings.add(words[i]);
                }
            }
        }
        return new ArrayList<String>(strings);
    }
}