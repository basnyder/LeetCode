/*
Runtime: 2747 ms, faster than 5.11% of Java online submissions for Vowel Spellchecker.
Memory Usage: 40.9 MB, less than 100.00% of Java online submissions for Vowel Spellchecker.
*/

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        //ckeck caps with two arrays of all same cased arrays
        //check vowels by checking letter by letter keep list of indicies to change?
        String[] wlc = new String[wordlist.length];
        String[] qc = new String[queries.length];
        String[] answer = new String[queries.length];
        int[] priority = new int[answer.length];
        String vowels = "aeiou";
        for (int i = 0; i < answer.length; i++) {
            if (qc[i] == null) {
                qc[i] = queries[i].toLowerCase();
            }
            for (int j = 0; j < wlc.length; j++) {
                if (wlc[j] == null) {
                    wlc[j] = wordlist[j].toLowerCase();
                }
                if (queries[i].equals(wordlist[j])) {
                    //if theyre same word
                    answer[i] = wordlist[j];
                    priority[i] = 3;
                    break;
                } else if (priority[i] < 2 && qc[i].equals(wlc[j])) {
                    //if theyre same word, regardless of case use proper word fully
                    answer[i] = wordlist[j];
                    priority[i] = 2;
                } else if (priority[i] < 1 && qc[i].length() == wlc[j].length()) {
                    //if same length, check vowels
                    boolean same = true;
                    for (int k = 0; k < qc[i].length(); k++) {
                        if (vowels.indexOf(qc[i].charAt(k)) == -1) {
                        	// isnt vowel
                            if (qc[i].charAt(k) != wlc[j].charAt(k)) {
                                same = false;
                                break;
                            }
                        } else {
                        	// is vowel
                            if (vowels.indexOf(wlc[j].charAt(k)) == -1) {
                                same = false;
                                break;
                            }
                        }
                    }
                    if (same) {
                        answer[i] = wordlist[j];
                        priority[i] = 1;
                    }
                }
            }
            if (answer[i] == null) {
                answer[i] = "";
            }
        }
        return answer;
    }
}