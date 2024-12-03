public class Kadane_Algorithm {
    static int  maxsubarraysum(int[] arr){
            int temp= 0;
            int max= Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                temp=Math.max(arr[i],temp+arr[i]);
                max=Math.max(max,temp);
            }

    return max;
    }
    public static void main(String[] args) {
        int [] arr={-2,-4};
        int max=maxsubarraysum(arr);
        System.out.println(max);
    }
}
