public class Max_Circular_Subarray_Sum {
    static int MAXSUM(int [] arr) {
        int Sum_Without_circularity=NONCIRCULARCASE(arr);
//        System.out.println("sum no circularity");
//        System.out.println(Sum_Without_circularity);
        int array_sum=0;
        for(int i=0;i<arr.length;i++){
            array_sum+=arr[i];
        }
//        System.out.println("array sum");
//        System.out.println(array_sum);
        int min_sum=Min_sum_subarray(arr);
//        System.out.println(min_sum);
        int circular_sum=array_sum-min_sum;
        if(circular_sum==0){
            return Sum_Without_circularity;
        }
//        System.out.println("circular");
//        System.out.println(circular_sum);
        int max=Math.max(circular_sum,Sum_Without_circularity);
        return max;

    }
    static int NONCIRCULARCASE(int[] arr){
        int temp= 0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            temp=Math.max(arr[i],temp+arr[i]);
            max=Math.max(max,temp);
        }

        return max;
    }
    static int Min_sum_subarray(int[] arr){
        int temp=arr[0];
        int minValue=arr[0];
        for(int i=1;i<arr.length;i++){
            temp=Math.min(arr[i],arr[i]+temp);
            minValue=Math.min(minValue,temp);
        }
        return minValue;
    }
public static void main(String[] args) {
    int [] arr={-2,-4,-5,-5};
    int max=MAXSUM(arr);
    System.out.println(max);
}
}
