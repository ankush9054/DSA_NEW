package Array;

public class pivot_sum {

    static int pivot(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int lsum = 0, rsum = sum;
        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];
            if (rsum == lsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
