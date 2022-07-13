package Recursion;

public class rev_arr {

    static void reverse(int arr[], int low, int high) {
        if (low >= high)
            return;
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        reverse(arr, low + 1, high - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr, 0, arr.length - 1);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }

    }

}
