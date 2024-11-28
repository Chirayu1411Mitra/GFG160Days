public class Push_zeros_to_end {
    static void push_zero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                if (i != count) {
                    arr[i] = 0;
                }
                count++;

            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,5,0,6,3};
        push_zero(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
