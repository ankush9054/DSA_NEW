package Recursion;

public class palindrome {

    static boolean pal(String str, int low, int high) {
        if (low == high) {
            return true;
        }

        if (str.charAt(low) != str.charAt(high))
            return false;

        return pal(str, low + 1, high - 1);
    }

    public static void main(String[] args) {
        String str = "radar";
        System.out.print(pal(str, 0, str.length() - 1));
    }

}
