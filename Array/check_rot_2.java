package Array;

public class check_rot_2 {

    static boolean isRotated(String str1, String str2) {
        int size1 = str1.length();
        String a = str1.substring(2, size1);
        String b = str1.substring(0, 2);
        String c = a + b;
        if (c.equals(str2)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
        System.out.print(isRotated(str1, str2));
    }

}
