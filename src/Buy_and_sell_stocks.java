public class Buy_and_sell_stocks {
    static int maxprofit(int[] arr){
        int n=arr[0];
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max += arr[i] - n;
                n=arr[i+1];
            }
        }
        max += arr[arr.length - 1] - n;
        return max;
    }

    public static void main(String[] args) {
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        int max=maxprofit(arr);
        System.out.println(max);
    }
}
