public class sorted_rotated_min {
    static int findMin(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start]<=arr[end]){
                return arr[start];
            }
            int mid = start + ((end-start)/2);
            if(mid<end&&arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            else if(mid>start&&arr[mid]<arr[mid-1]){
                return arr[mid];

            }
            else{
                if(arr[mid]>arr[start]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[ ]arr = {91,96};
        int min=findMin(arr);
        System.out.println(min);
    }
}
