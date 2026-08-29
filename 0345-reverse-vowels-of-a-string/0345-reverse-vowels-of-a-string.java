class Solution {
    public boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (!isvowel(arr[i])) {
                i++;
            } else if (!isvowel(arr[j])) {
                j--;
            } else {
                char curr = arr[i];
                arr[i] = arr[j];
                arr[j] = curr;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}