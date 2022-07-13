package Array;

public class stock_2 {

    static int stockbuyandsell(int arr[]) {
        int buy = 0;
        int max_profit = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                buy = arr[i];
            }
            if (arr[i] > buy) {
                max_profit = Math.max(max_profit, arr[i] - buy);
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {

        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print(stockbuyandsell(arr));

    }

}
