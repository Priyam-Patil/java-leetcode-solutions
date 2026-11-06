import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("*");
                sb.append(i);//create unique pattern for each string
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());

    }
}