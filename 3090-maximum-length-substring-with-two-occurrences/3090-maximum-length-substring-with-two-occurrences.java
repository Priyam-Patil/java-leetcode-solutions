class Solution {
    public int maximumLengthSubstring(String s) {
        int fre[] = new int[26];
        int l = 0;
        int mx = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch - 'a']++;

            while (fre[ch - 'a'] > 2) {
                fre[s.charAt(l) - 'a']--;
                l++;
            }

            mx = Math.max(mx, i - l + 1);
        }

        return mx;
    }
}