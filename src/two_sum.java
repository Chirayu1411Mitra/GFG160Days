import java.util.HashSet;
import java.util.Set;

public class two_sum {
     static boolean twoSum(int arr[], int target) {
        Set<Integer> seen = new HashSet<>();
        for(int num : arr ){
            if(seen.contains(target - num)) return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,45,6,10,8};
        int target=16;
        boolean check=twoSum(arr,target);
        System.out.println(check);
    }
}
