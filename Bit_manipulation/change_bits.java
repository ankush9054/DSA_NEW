package Bit_manipulation;

public class change_bits {

    static int[] changebits(int n) {
        String bin = Integer.toBinaryString(n);
        System.out.print(bin);
        String ns = "";
        for (int i = 0; i < bin.length(); i++) {
            ns += '1';
        }
        int t1 = Integer.parseInt(ns, 2);
        return new int[] { t1 - n, t1 };
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.print(changebits(n));
    }

}
