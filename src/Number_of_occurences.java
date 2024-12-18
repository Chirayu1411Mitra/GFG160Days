public class Number_of_occurences {
    static int countFreq(int[] arr, int target) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                break;
            }
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,6,7,8,9,9,9,9,9,9};
        int num=countFreq(arr,1);
        System.out.println(num);
    }
}
