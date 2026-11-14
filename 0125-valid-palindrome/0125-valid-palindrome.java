// two pointer approach
// method-1
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// method-02
// class Solution {
//     private boolean isAlphaDigit(char ch) {
//         return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
//     }

//     public boolean isPalindrome(String s) {
//         int l = 0;
//         int r = s.length() - 1;
//         while (l < r) {
//             char left = s.charAt(l);
//             char right = s.charAt(r);
//             if (!isAlphaDigit(left)) {
//                 l++;
//             } else if (!isAlphaDigit(right)) {
//                 r--;
//             } else {
//                 if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
//                     return false;

//                 }
//                 l++;
//                 r--;
//             }

//         }
//         return true;
//     }
// }

// method-03
// class Solution {
//     public boolean isPalindrome(String s) {
//         int l = 0;
//         int r = s.length() - 1;
//         while (l < r) {
//             char left = s.charAt(l);
//             char right = s.charAt(r);
//             if (!Character.isLetterOrDigit(left)) {
//                 l++;
//             } else if (!Character.isLetterOrDigit(right)) {
//                 r--;
//             } else {
//                 if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
//                     return false;
//                 }
//                 l++;
//                 r--;
//             }
//         }
//         return true;
//     }
// }