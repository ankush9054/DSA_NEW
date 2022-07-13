package Sliding_window;

class max_sum_subarray {

    static int mx_sum(int arr[], int size, int k) {
        size = arr.length;
        int low = 0, high = 0;
        int curr_sum = 0;
        int mx = Integer.MIN_VALUE;
        while (high < size) {
            curr_sum += arr[high];
            if (high - low + 1 < k) {
                high++;
            } else if (high - low + 1 == k) {
                mx = Math.max(mx, curr_sum);
                curr_sum -= arr[low];
                low++;
                high++;
            }

        }
        return mx;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7 };
        int k = 3;
        int size = 7;
        System.out.print(mx_sum(arr, size, k));
    }
}