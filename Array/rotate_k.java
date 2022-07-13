package Array;

public class rotate_k {

    static void rev(int low, int high, int arr[]) {
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }

    }

    static void rot_k_left(int arr[], int k) {
        int size = arr.length - 1;
        rev(0, k - 1, arr);
        rev(k, size, arr);
        rev(0, size, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    static void rot_k_right(int arr1[], int k) {
        rev(arr1.length - k, arr1.length - 1, arr1);
        rev(0, arr1.length - k - 1, arr1);
        rev(0, arr1.length - 1, arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rot_k_left(arr, k);
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        rot_k_right(arr1, k);

    }

}
