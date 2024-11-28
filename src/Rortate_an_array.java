public class Rortate_an_array {
    static void Rotate(int [] arr, int d) {
        d=d%arr.length;
        rev(arr,0,d-1);
        rev(arr,d,arr.length-1);
        rev(arr,0, arr.length-1);
        }

        static void rev(int[] arr,int start,int end) {

            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
        }

    }

    public static void main(String[] args) {
        int d=9;
        int[] arr={7,3,9,1};
        Rotate(arr,d);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
