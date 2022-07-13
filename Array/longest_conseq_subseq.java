package Array;

import java.util.Arrays;

public class longest_conseq_subseq {

    static int findLongestConseqSubseq(int arr[], int N) {
        Arrays.sort(arr);
        int count = 1;
        int rescount = 1;
        for (int i = 0; i < N; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else if (arr[i + 1] == arr[i]) {
                count = count + 1;
            } else if (arr[i + 1] != arr[i] + 1) {
                count = 1;
            }
            rescount = Math.max(rescount, count);
        }
        return rescount;
    }

    public static void main(String[] args) {
        int N = 7;
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };
        System.out.print(findLongestConseqSubseq(arr, N));
    }

}
