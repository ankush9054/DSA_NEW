package Array;

public class remove_ele {

    static int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count -= 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;
        System.out.print(removeElement(nums, val));
    }

}
