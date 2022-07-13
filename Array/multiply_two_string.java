package Array;

public class multiply_two_string {

    static void multiplyStrings(String s1, String s2) {
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);
        String res = Integer.toString(i * j);
        System.out.print(res);
    }

    public static void main(String[] args) {
        String s1 = "2";
        String s2 = "10";
        multiplyStrings(s1, s2);
    }

}
