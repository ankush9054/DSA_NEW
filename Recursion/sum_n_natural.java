package Recursion;

public class sum_n_natural {

    static int natural(int n) {
        int sum = 0;
        if (n == 0)
            return 0;
        sum = n + natural(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(natural(5));
    }

}
