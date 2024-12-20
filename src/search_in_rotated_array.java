public class search_in_rotated_array {
    static int find_pivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+((end-start)/2);
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else{
                if (arr[mid]>arr[start]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    static int BS_Rotated(int [] arr,int target){
        int pivot=find_pivot(arr);
        if(pivot==-1){
            return BS(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if (target >= arr[0]) {
            return BS(arr, target, 0, pivot);
        } else {
            return BS(arr, target, pivot + 1, arr.length - 1);
        }

    }
    static int BS(int [] arr,int target,int start,int end){
        while(start<=end){
            int  mid=start+((end-start)/2);
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arr={5,6,7,1,2,3};
        int result=BS_Rotated(arr,3);
        System.out.println(result);

    }
}
