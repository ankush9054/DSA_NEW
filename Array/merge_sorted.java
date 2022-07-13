package Array;


public class merge_sorted {

    static void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1, j = n - 1, k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0 && k >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int nums1[] = { 1 }, m = 1, nums2[] = {}, n = 0;

        merge(nums1, m, nums2, n);

        
    }

}
