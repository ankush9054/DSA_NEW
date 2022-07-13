// package Array;

// import java.util.*;

// public class rev_arr_group {

// static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
// int low = 0, high = low + k - 1;
// while (low <= high) {
// reverse(0, low + k - 1, arr);
// }
// reverse(k + 1, n - 1, arr);
// }

// static void reverse(int low, int high, ArrayList<Integer> li) {
// while (low <= high) {
// Collections.swap(li, low, high);
// }
// }

// public static void main(String[] args) {
// int n = 5, k = 3;
// ArrayList<Integer>arr =
// reverseInGroups(arr, n, k);
// }

// }
