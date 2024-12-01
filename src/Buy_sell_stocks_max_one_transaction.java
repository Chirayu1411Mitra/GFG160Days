public class Buy_sell_stocks_max_one_transaction {
    static int Max(int[] arr){
        int n=Integer.MAX_VALUE;
        int max=0;
        int profit=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<n){
                n=arr[i];
            }
            profit=arr[i]-n;
            if(profit>max){
                max=profit;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int max=Max(arr);
        System.out.println(max);
    }
}
