public class Count_inversion {
    static int merge(int[] arr, int a, int b, int c) {

        int n1 = b - a + 1, n2 = c - b;

        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++)
            left[i] = arr[i + a];
        for (int j = 0; j < n2; j++)
            right[j] = arr[b + 1 + j];
        int res = 0;
        int i = 0, j = 0, k = a;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                res += (n1 - i);
            }
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

        return res;
    }
    static int count(int[] arr, int a, int b) {
        int res = 0;
        if (a < b) {
            int c = (b + a) / 2;

            res += count(arr, a, c);
            res += count(arr, c + 1, b);
            res += merge(arr, a, c, b);
        }
        return res;
    }

    static int inversionCount(int[] arr) {
        return count(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(inversionCount(arr));
    }
}

