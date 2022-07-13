package Array;

import java.util.HashMap;

public class decode {

    static String decodeMessage(String key, String message) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String str = "";

        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            for (char j : arr) {
                hm.put(c, j);
            }
        }

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (hm.containsKey(c)) {
                str += hm.get(c);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.print(decodeMessage(key, message));
    }

}
