package Array;

public class no_unique_ele {

    static int dup(int arr[]) {
        int low = 0, high = 0;
        while (high < arr.length - 1) {

            if (arr[high] == arr[high + 1]) {
                high++;
            } else if (arr[high] != arr[high + 1]) {
                low++;
                high++;
            }
        }
        return low;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3 };
        System.out.print(dup(arr));

    }

}
