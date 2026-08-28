
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r &&
                    !((s.charAt(l) >= 'a' && s.charAt(l) <= 'z') || (s.charAt(l) >= 'A' && s.charAt(l) <= 'Z')
                            || (s.charAt(l) >= '0' && s.charAt(l) <= '9'))) {
                l++;//skip non-alphanumeric from starting
            }
            while (l < r &&
                    !((s.charAt(r) >= 'a' && s.charAt(r) <= 'z') || (s.charAt(r) >= 'A' && s.charAt(r) <= 'Z')
                            || (s.charAt(r) >= '0' && s.charAt(r) <= '9'))) {
                r--;//skip non-alphanumeric from ending
            }
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));
            if (left != right) {
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
}