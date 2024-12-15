import java.util.Arrays;

public class H_ndex {
        static int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length;

            for (int i = 0; i < n; i++) {
                int h = n - i;
                if (citations[i] >= h) {
                    return h;
                }
            }

            return 0;

    }

    public static void main(String[] args) {
        int [] arr={1,1,2,3,4,5};
        int hindex= hIndex(arr);
        System.out.println(hindex);
    }
}
