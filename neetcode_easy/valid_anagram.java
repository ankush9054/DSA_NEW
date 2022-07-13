package neetcode_easy;

import java.util.HashMap;

public class valid_anagram {

    static boolean ana(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();

        if (s1 != t1)
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (char c : hm.keySet()) {
            if (hm.get(c) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
