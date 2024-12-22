public class kth_element_in_2_sorted_array {
    static int kthElement(int[] a,int[] b,int k) {
        if (a.length > b.length) return kthElement(b, a, k);

        int start = Math.max(0, k - b.length), end = Math.min(k, a.length);

        while (start <= end) {
            int c1 = (start + end) / 2;
            int c2 = k - c1;

            int l1 = (c1 > 0) ? a[c1 - 1] : Integer.MIN_VALUE;
            int l2 = (c2 > 0) ? b[c2 - 1] : Integer.MIN_VALUE;
            int r1 = (c1 < a.length) ? a[c1] : Integer.MAX_VALUE;
            int r2 = (c2 < b.length) ? b[c2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            if (l1 > r2) {
                end = c1 - 1;
            } else {
                start = c1 + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={7,8,9};
        int target=4;
        int k=kthElement(arr1,arr2,target);
        System.out.println(k);

    }
}
