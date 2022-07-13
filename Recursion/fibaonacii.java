package Recursion;

public class fibaonacii {
    static int fibo(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        int p1 = fibo(n - 1);
        int p2 = fibo(n - 2);
        return p1 + p2;
    }

    public static void main(String[] args) {
        System.out.print(fibo(3));
    }

}
