
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }
        for (int freq : count) {
            if (Math.abs(freq-0) > 3) {
                return false;
            }
        }
        return true;
    }
}