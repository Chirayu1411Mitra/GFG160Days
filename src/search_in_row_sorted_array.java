import java.util.Arrays;

public class search_in_row_sorted_array{
    static  boolean searchRowMatrix(int[][] mat, int x) {
        for (int[] row : mat) {
            if (Arrays.binarySearch(row, x) >= 0) {
                return true;
            }
        }
        return false;
    }
public static void main(String[] args){
  int[][] matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}
    };
    
    int target = 3;
    boolean found = searchRowMatrix(matrix, target);
    System.out.println("Is the target found? " + found);
}

}
