public class Maximum_product_in_subarray {
    static int MaxPro(int[] arr){
        int preffix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(preffix==0) preffix=1;
            if(suffix==0) suffix=1;
            preffix=preffix*arr[i];
            suffix=suffix*arr[arr.length-i-1];
            max= Math.max(max,Math.max(preffix,suffix));
            }
        return max;
        }


    public static void main(String[] args) {
        int [] arr={0,2};
        int max=MaxPro(arr);
        System.out.println(max);
    }
}
