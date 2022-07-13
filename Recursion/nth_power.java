package Recursion;

public class nth_power {

    static int power(int x, int n) {
        if (n == 0)
            return 1;
        int po = x * power(x, n - 1);
        return po;
    }

    public static void main(String[] args) {
        System.out.print(power(2, 6));
    }

}
