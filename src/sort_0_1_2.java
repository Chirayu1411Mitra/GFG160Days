import java.util.Arrays;

public class sort_0_1_2 {
    static int[] sort(int [] arr) {
//        int count0 = 0;  //  time complexity:: o(2n)
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                count0++;
//            } else if (arr[i] == 1) {
//                count1++;
//            } else if (arr[i] == 3) {
//                count2++;
//            }
//
//        }
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        for (int i = count0; i < count0 + count1; i++) {
//            arr[i] = 1;
//        }
//        for (int i = count0 + count1; i < arr.length; i++) {
//            arr[i] = 2;
//        }
//        return arr;
//    }
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                    high--;
                }
            }
        return arr;
        }

    public static void main(String[] args) {
        int [] arr={0,1,2,0,1,1,1,2,2,2,0,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    }


