import java.util.Arrays;

public class Minimum_smallest_integer_in_array {
    static int smallest_int(int[]arr){
        int missing_min=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==missing_min){
                missing_min++;
            }
            if (arr[i]>missing_min) {
                break;

            }
        }
        return missing_min;

    }


    public static void main(String[] args) {
        int [] arr={3, 4, -1, 1};
        int minimum=smallest_int(arr);
        System.out.println(minimum);
    }
}
