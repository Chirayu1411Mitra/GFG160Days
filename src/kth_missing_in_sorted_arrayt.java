public class kth_missing_in_sorted_arrayt {
    static int kthMissing(int[] arr, int k) {
        int start = 0, end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start + k;
    }

    public static void main(String[] args) {
        int [] arr={1,3,4,5,6,8,9};
        int k=5;
        int missing=kthMissing(arr,k);
        System.out.println(missing);
    }
}
