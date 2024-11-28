public class Second_largest_in_array {
    static int Second_largest(int[] arr){
        int max=0;
       int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){

                max2=arr[i];

            }
            else if(max2==0){
                return -1;
            }

        }
        return max2;
    }
    public static void main(String[] args) {
        int[] arr={10,10,10};
        int max =  Second_largest(arr);
        System.out.println(max);
    }
}
