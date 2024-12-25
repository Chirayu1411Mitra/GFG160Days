import java.util.Arrays;

public class Aggressive_cows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int start = 1, end = stalls[stalls.length - 1] - stalls[0], result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 1, last = stalls[0];
            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - last >= mid) {
                    count++;
                    last = stalls[i];
                }
            }
            if (count >= k) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5};
        int k =1;
        int AC=aggressiveCows(arr,k);
        System.out.println(AC);
    }
}
