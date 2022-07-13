package Array;

import java.util.Arrays;

public class triplet_sum_arr {

    static boolean find3Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;

            while (j < k) {
                int sum = A[i] + A[j] + A[k];
                if (sum < X) {
                    j++;
                } else if (sum > k) {
                    k--;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 6, X = 13;
        int A[] = { 6, 4, 45, 6, 10, 8 };
        System.out.print(find3Numbers(A, n, X));
    }

}
