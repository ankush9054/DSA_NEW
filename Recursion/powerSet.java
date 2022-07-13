//Backtracking problem 
package Recursion;

import java.util.ArrayDeque;
import java.util.Deque;

class powerSet {

    static void findPowerSet(char[] s, Deque<Character> res, int n) {

        if (n == 0) {
            for (Character i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        res.addLast(s[n - 1]);
        findPowerSet(s, res, n - 1);
        res.removeLast();
        findPowerSet(s, res, n - 1);
    }

    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c' };
        Deque<Character> res = new ArrayDeque<>();
        findPowerSet(ch, res, 3);

    }
}