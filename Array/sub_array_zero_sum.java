package Array;

import java.util.HashMap;

public class sub_array_zero_sum {

    static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxi = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (hm.containsKey(sum)) {
                    maxi = Math.max(maxi, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

    }

}
