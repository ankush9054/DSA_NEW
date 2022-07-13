package Array;

import java.util.Arrays;

public class three_sum_closest {

    static int sum3(int arr[], int target) {
        int ans = 0, min_diff = Integer.MAX_VALUE, n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
                if (Math.abs(sum - target) < min_diff) {
                    min_diff = Math.abs(sum - target);
                    ans = sum;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = { -1, 2, 3, -4 };
        // int target = 1;

    }

}
