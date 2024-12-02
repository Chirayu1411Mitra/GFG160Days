import java.util.Arrays;


//Given an array arr[] denoting heights of N towers and a positive integer K.
//
//For each tower, you must perform exactly one of the following operations exactly once.
//
//Increase the height of the tower by K
//Decrease the height of the tower by K
//Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.
//
//You can find a slight modification of the problem here.
//Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.
public class Minimize_height_2 {
    static int Mindiff(int[] arr,int k){
        Arrays.sort(arr);
        if (arr.length== 1){
            return 0;
        }
        int small=arr[0]+k;
        int large=arr[arr.length-1]-k;
        int diff=arr[arr.length-1]-arr[0];
        int min=0;
        int max=0;

        for(int i=0;i<arr.length-1;i++){
            min=Math.min(small,arr[i+1]-k);
            max=Math.max(large,arr[i]+k);
            if(min<0) continue;
            diff=Math.min(diff,max-min);
        }
        return diff;
    }

    public static void main(String[] args) {
    int [] arr={21,293,292};
    int k=37;
    int diff=Mindiff(arr,k);
        System.out.println(diff);
        }
    }

