package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class permutation {

    static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    static void perm(int pos, String str, ArrayList<String> ans) {

        if (pos >= str.length()) {
            ans.add(str);
        }
        for (int i = pos; i < str.length(); i++) {
            swap(str, i, pos);
            perm(pos + 1, str, ans);
            swap(str, i, pos); // backtracking
        }
    }

    static ArrayList<String> generatepermutation(String str) {
        ArrayList<String> ans = new ArrayList<>();
        perm(0, str, ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.print(generatepermutation(str));
    }

}
