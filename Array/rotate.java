package Array;

public class rotate {

    static void rotate_left(int arr[]) {
        int temp = arr[0];
        int size = arr.length;
        int high = size - 1;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[high] = temp;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotate_right(int arr1[]) {
        int temp = arr1[arr1.length - 1];
        for (int i = arr1.length - 1; i > 0; i--) {
            arr1[i] = arr1[i - 1];
        }
        arr1[0] = temp;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rotate_left(arr);
        System.out.println();
        rotate_right(arr1);

    }

}
