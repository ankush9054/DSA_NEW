package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class two_sum {

    static ArrayList<Integer> sum(int arr[], int target) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            hm.put(arr[i], i);
            if (hm.containsKey(diff)) {
                list.add(hm.get(diff));
                list.add(i);
            }
        }
        return list;
    }

    // static ArrayList<Integer> sum_op(int arr[], int target) {
    // Arrays.sort(arr);
    // ArrayList<Integer> res = new ArrayList<>();
    // int low = 0, high = arr.length - 1;
    // while (low < high) {
    // if (arr[low] + arr[high] > target) {
    // high--;
    // } else if (arr[low] + arr[high] < target) {
    // low++;
    // } else {
    // res.add(low);
    // res.add(high);
    // }
    // }
    // return res;
    // }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        // System.out.print(sum_op(arr, target));
        System.out.print(sum(arr, target));

    }

}
