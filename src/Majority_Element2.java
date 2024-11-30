import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Majority_Element2 {
    static List<Integer> majority(int[] nums){
        ArrayList<Integer> list =new ArrayList<>();
        int count1=0;
        int count2=0;
        int ele1=0;
        int ele2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!=ele1){
                count2=1;
                ele2=nums[i];
            } else if (ele1==nums[i]) {
                count1++;
            } else if (ele2==nums[i]) {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int num:nums){
            if(num==ele1){
                count1++;
            } else if (num==ele2) {
                count2++;
            }
        }
        if(count1>nums.length/3){
            list.add(ele1);
        }
        if(count2>nums.length/3){
            list.add(ele2);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,3};
        List<Integer> list1=majority(nums);
        System.out.println(list1);
    }
}
