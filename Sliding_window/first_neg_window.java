package Sliding_window;

import java.util.*;

public class first_neg_window {

    static ArrayList<Integer> negetive(int arr[], int size, int k) {
        int low = 0, high = 0;
        size = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        while (high < size) {
            if (arr[high] < 0) {
                q.add(arr[high]);
            }
            if (high - low + 1 < k) {
                high++;
            } else if (high - low + 1 == k) {
                if (q.isEmpty()) {
                    list.add(0);
                } else {
                    list.add(q.peek());
                    if (arr[low] == q.peek()) {
                        q.remove();
                    }
                }
                low++;
                high++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 3, -4, 5, -6, 7, 8 };
        System.out.print(negetive(arr, 9, 3));
    }

}
