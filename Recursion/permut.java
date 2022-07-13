package Recursion;

import java.util.*;

class permut {
    HashSet<String> res = new HashSet<String>();

    // Swapping the character method
    public String swap(String str, int l, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(l, str.charAt(i));
        sb.setCharAt(i, str.charAt(l));
        return sb.toString();
    }

    // Logic method
    public void permute(String s, int l, int r) {

        // Base Condition
        if (l == r) {
            res.add(s);
            return;
        }

        // Swapping the characters
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r);
            s = swap(s, l, i);
        }
        return;
    }

    // Main method
    public List<String> find_permutation(String S) {
        // Code here
        permute(S, 0, S.length() - 1);

        // Converting setList into the ArrayList
        List<String> strList = new ArrayList<>(res);

        // Sorting the list in lexographical order
        Collections.sort(strList);
        return strList;
    }
}
