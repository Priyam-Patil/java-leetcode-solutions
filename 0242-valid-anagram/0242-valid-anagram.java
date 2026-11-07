
class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] count = new int[26];
        for (int i = 0; i < m; i++) {
            char curr = s.charAt(i);
            count[curr - 'a']++;
        }
        for (int j = 0; j < n; j++) {
            char curr = t.charAt(j);
            count[curr - 'a']--;
        }
        for (int k = 0; k < count.length; k++) {
            if (count[k] != 0) {
                return false;
            }
        }
        return true;
    }
}